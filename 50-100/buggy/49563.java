public void setDefaults(org.eclipse.core.runtime.IProgressMonitor monitor) {
    org.eclipse.wst.server.core.IRuntime rt = getServer().getRuntime();
    if (rt != null) {
        getServerWorkingCopy().setName(org.jboss.ide.eclipse.as.core.util.ServerNamingUtility.getDefaultServerName(rt));
    }else {
        getServerWorkingCopy().setName(org.jboss.ide.eclipse.as.core.util.ServerNamingUtility.getNextShortServerName(getServer().getServerType()));
    }
    setAttribute(IJBossToolingConstants.IGNORE_LAUNCH_COMMANDS, true);
    getServerWorkingCopy().setHost("localhost");
}