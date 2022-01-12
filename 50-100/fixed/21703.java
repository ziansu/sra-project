private java.io.File getInstallDirectory() {
    java.io.File installDirectory = new java.io.File(config.getInstallDirectory(), com.github.eirslett.maven.plugins.frontend.lib.YarnInstaller.INSTALL_PATH);
    if (!(installDirectory.exists())) {
        logger.debug("Creating install directory {}", installDirectory);
        installDirectory.mkdirs();
    }
    return installDirectory;
}