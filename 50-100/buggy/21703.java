private java.io.File getInstallDirectory() {
    java.io.File installDirectory = new java.io.File(this.config.getInstallDirectory(), com.github.eirslett.maven.plugins.frontend.lib.YarnInstaller.INSTALL_PATH);
    if (!(installDirectory.exists())) {
        this.logger.debug("Creating install directory {}", installDirectory);
        installDirectory.mkdirs();
    }
    return installDirectory;
}