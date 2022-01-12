@org.junit.Test
public void tcu_update_result_post() throws com.jxmobi.util.exception.RestCallFailedException, java.io.IOException, java.net.URISyntaxException {
    java.lang.String uuid = "1603260027";
    java.lang.String version = "V01-01-03";
    com.jxmobi.tms.domain.vo.TcuQueryForUpdateVo queryForUpdateVo = new com.jxmobi.tms.domain.vo.TcuQueryForUpdateVo();
    queryForUpdateVo.setUuid(uuid);
    queryForUpdateVo.setVersion(version);
    queryForUpdateVo.setCode(TcuQueryForUpdateCmdType.FINISH_UPDATE);
    com.jxmobi.mediator.rest.RestCallStack callStack = new com.jxmobi.mediator.rest.RestCallStack();
    com.jxmobi.mediator.rest.RestEndpointConfig config = new com.jxmobi.mediator.rest.RestEndpointConfig();
    callStack.initialize(config);
    com.jxmobi.tms.domain.bo.TcuUpdateConfirmBo confirmBo = callStack.putSinglePojoToRemote("update-plans/tcu_update/", com.jxmobi.tms.domain.bo.TcuUpdateConfirmBo.class, queryForUpdateVo);
    java.lang.System.out.println(confirmBo);
}