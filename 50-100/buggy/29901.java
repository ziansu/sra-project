@org.springframework.context.event.EventListener
public void onAppCreationEvent(com.ctrip.framework.apollo.portal.listener.AppCreationEvent event) {
    com.ctrip.framework.apollo.core.dto.AppDTO appDTO = com.ctrip.framework.apollo.common.utils.BeanUtils.transfrom(com.ctrip.framework.apollo.core.dto.AppDTO.class, event.getApp());
    java.util.List<com.ctrip.framework.apollo.core.enums.Env> envs = portalSettings.getActiveEnvs();
    for (com.ctrip.framework.apollo.core.enums.Env env : envs) {
        try {
            appAPI.createApp(env, appDTO);
        } catch (org.springframework.web.client.HttpStatusCodeException e) {
            com.ctrip.framework.apollo.portal.listener.CreationListener.logger.error("call appAPI.createApp error.[{app}, {env}]", appDTO.getAppId(), env, e);
        }
    }
}