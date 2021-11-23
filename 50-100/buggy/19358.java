private java.lang.String stopServer(java.lang.String serverId) {
    for (int i = 0; i < (serverConfigList.size()); ++i) {
        if (serverConfigList.get(i).getId().equals(serverId)) {
            serverConfigMap = serverConfigList.get(i);
            serverConfigMap.setRunning("false");
        }
    }
    org.aw20.jettydesktop.controller.AppFunctions.executor.exit();
    if ((org.aw20.jettydesktop.controller.AppFunctions.executor.isbRun()) == false)
        return "Server stopped";
    else
        return "Server not stopped";
    
}