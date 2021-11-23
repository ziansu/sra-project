private com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable getMonitorVariable(java.lang.String objectName, java.lang.String name, java.lang.Integer value) {
    com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable monitorVariable = new com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable(name, value.toString());
    monitorVariable.setObjectName(objectName);
    return monitorVariable;
}