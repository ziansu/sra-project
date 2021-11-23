@org.junit.Test
public void tcu_query_update() throws com.jxmobi.util.exception.RestCallFailedException, java.io.IOException, java.lang.IllegalAccessException, java.net.URISyntaxException {
    java.lang.String uuid = "1603260027";
    com.jxmobi.tms.domain.vo.TcuQueryForUpdateVo queryForUpdateVo = new com.jxmobi.tms.domain.vo.TcuQueryForUpdateVo();
    queryForUpdateVo.setUuid(uuid);
    queryForUpdateVo.setVersion("V01-01-02");
    queryForUpdateVo.setCode(TcuQueryForUpdateCmdType.QUERY_UPDATE);
    com.jxmobi.mediator.rest.RestCallStack callStack = new com.jxmobi.mediator.rest.RestCallStack();
    callStack.initialize(new com.jxmobi.mediator.rest.RestEndpointConfig());
    com.jxmobi.tms.domain.bo.TcuQueryUpdateBo queryBo = callStack.postSinglePojoToRemote("update-plans/tcu_update_query", com.jxmobi.tms.domain.bo.TcuQueryUpdateBo.class, queryForUpdateVo);
    java.lang.System.out.println(queryBo);
}