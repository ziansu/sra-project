private com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable getMonitorVariable(java.lang.String queueName, java.lang.String objectName, java.lang.Integer value) {
    com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable monitorVariable = new com.uptimesoftware.uptime.plugin.monitor.PluginMonitorVariable(queueName, value.toString());
    monitorVariable.setObjectName(objectName);
    return monitorVariable;
}