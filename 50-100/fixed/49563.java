public void setDefaults(org.eclipse.core.runtime.IProgressMonitor monitor) {
    setAttribute(IJBossToolingConstants.IGNORE_LAUNCH_COMMANDS, true);
    getServerWorkingCopy().setHost("localhost");
    org.eclipse.wst.server.core.IRuntime rt = getServer().getRuntime();
    java.lang.String name = (rt != null) ? org.jboss.ide.eclipse.as.core.util.ServerNamingUtility.getDefaultServerName(rt) : org.jboss.ide.eclipse.as.core.util.ServerNamingUtility.getNextShortServerName(getServer().getServerType());
    getServerWorkingCopy().setName(name);
}