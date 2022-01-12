@java.lang.Override
protected java.lang.String getNetworks(com.sixsq.slipstream.persistence.Run run, com.sixsq.slipstream.persistence.User user) throws com.sixsq.slipstream.exceptions.ValidationException {
    java.lang.String networks = "";
    if (isInOrchestrationContext(run)) {
        networks = user.getParameter(constructKey(CloudStackAdvancedZoneSystemConfigurationParametersFactory.ORCHESTRATOR_NETWORKS)).getValue();
    }else {
        com.sixsq.slipstream.persistence.ImageModule machine = com.sixsq.slipstream.persistence.ImageModule.load(run.getModuleResourceUrl());
        networks = machine.getParameterValue(constructKey(CloudStackAdvancedZoneImageParametersFactory.NETWORKS), null);
    }
    return networks;
}