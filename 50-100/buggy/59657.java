private static void addExistingServers() {
    org.eclipse.wst.server.core.IServer[] s = org.eclipse.wst.server.core.ServerCore.getServers();
    for (org.eclipse.wst.server.core.IServer server : s) {
        if (!(org.wso2.developerstudio.eclipse.carbonserver.base.manager.CarbonServerManager.getServers().contains(server)))
            org.wso2.developerstudio.eclipse.carbonserver.base.manager.CarbonServerManager.serverAdded(server);
        
    }
}