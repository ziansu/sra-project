public void stop(java.lang.String cfgId) {
    com.jsoft.iot.mqttloadapp.runtime.LoadConfigurationRuntimeRegistry.LOG.log(java.util.logging.Level.INFO, "Stopping Running Load configuration {0}", cfgId);
    com.jsoft.iot.mqttloadapp.runtime.RunningLoadConfiguration rt = registry.get(cfgId);
    if (rt != null) {
        registry.remove(cfgId);
        rt.stop(cfgId);
    }else {
        throw new java.lang.RuntimeException(("Could not find running load configuration " + cfgId));
    }
}