public void signalUpdatedFile(java.io.File iFile) {
    synchronized(this) {
        for (org.romaframework.aspect.view.screen.config.ScreenConfiguration d : configuration.values()) {
            if (d.getFile().equals(iFile)) {
                org.romaframework.aspect.view.screen.config.ScreenConfigurationLoader.log.warn(("[DesktopConfigurationLoader.signalUpdatedFile] Reloading file: " + iFile));
                try {
                    d.load();
                } catch (java.lang.Exception e) {
                    org.romaframework.aspect.view.screen.config.ScreenConfigurationLoader.log.error(("[DesktopConfigurationLoader.signalUpdatedFile] Error on loading updated descriptor: " + (iFile.getAbsolutePath())));
                }
                break;
            }
        }
    }
}