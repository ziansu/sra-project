public void install() throws com.github.eirslett.maven.plugins.frontend.lib.InstallationException {
    if (!(nodeIsAlreadyInstalled())) {
        if (platform.isWindows()) {
            installNodeForWindows();
        }else {
            installNodeDefault();
        }
    }
    if (!(npmIsAlreadyInstalled())) {
        installNpm();
    }
}