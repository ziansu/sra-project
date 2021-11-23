public boolean uploadPeerOwnerEnvironment(io.subutai.core.environment.impl.entity.LocalEnvironment env) {
    if (!(canWorkWithHub())) {
        return false;
    }
    if ((env.getStatus()) != (io.subutai.common.environment.EnvironmentStatus.HEALTHY)) {
        return false;
    }
    try {
        com.fasterxml.jackson.databind.node.ObjectNode envJson = environmentToJson(env);
        environmentPeersToJson(env, envJson);
        environmentContainersToJson(env, envJson);
        return hubAdapter.uploadPeerOwnerEnvironment(envJson.toString());
    } catch (java.lang.Exception e) {
        log.debug("Error to post local environment to Hub: ", e);
    }
    return false;
}