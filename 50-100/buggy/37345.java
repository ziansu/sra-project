public com.playonlinux.framework.WinePrefix create(java.lang.String version, java.lang.String distribution) throws com.playonlinux.installer.CancelException {
    try {
        return this.create(version, com.playonlinux.utils.Architecture.fetchCurrentArchitecture().name(), com.playonlinux.framework.WinePrefix.DEFAULT_DISTRIBUTION_NAME);
    } catch (com.playonlinux.installer.CancelException e) {
        throw e;
    } catch (com.playonlinux.app.PlayOnLinuxException e) {
        throw new com.playonlinux.framework.ScriptFailureException("Unable to create the wineprefix", e);
    }
}