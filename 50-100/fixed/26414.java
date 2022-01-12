public void initializeTheServer(org.eclipse.wst.server.core.IServer server) throws org.eclipse.core.runtime.CoreException {
    java.lang.String serverLocalWorkspacePath = org.wso2.developerstudio.eclipse.carbonserver.base.manager.CarbonServerManager.getServerLocalWorkspacePath(server);
    java.lang.String serverLocalRepoLocation = carbonServer44eiUtils.getRepositoryPathFromLocalWorkspaceRepo(serverLocalWorkspacePath);
    java.lang.String serverLocalConfLocation = carbonServer44eiUtils.getConfPathFromLocalWorkspaceRepo(serverLocalWorkspacePath);
    carbonServer44eiUtils.updateTransportPorts(server);
    org.wso2.developerstudio.eclipse.carbonserver44ei.operations.CarbonOperationsManager44ei.isServerHotUpdate(server);
    initializeServerRepoLibraries(server);
    java.util.List<org.wso2.developerstudio.eclipse.carbonserver.base.interfaces.ICarbonServerMonitor> serverMonitors = org.wso2.developerstudio.eclipse.carbonserver.base.impl.CarbonServer.getServerMonitors(server);
    org.eclipse.wst.server.core.IServerListener serverListener = new org.wso2.developerstudio.eclipse.carbonserver44ei.monitor.CarbonServerListener(serverMonitors);
    server.addServerListener(serverListener);
}