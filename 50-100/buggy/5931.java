public static uniandes.unacloud.agent.platform.VirtualBox.VirtualBox getInstalledVirtualBoxPlatform(java.lang.String path) throws uniandes.unacloud.agent.exceptions.UnsupportedPlatformException {
    java.lang.String h = uniandes.unacloud.common.utils.LocalProcessExecutor.executeCommandOutput(path, "--version");
    if (h.matches(((VBox5.VERSION) + ".*")))
        return new uniandes.unacloud.agent.platform.VirtualBox.VBox5(path);
    
    if (h.matches(((VBox43.VERSION) + ".*")))
        return new uniandes.unacloud.agent.platform.VirtualBox.VBox43(path);
    
    throw new uniandes.unacloud.agent.exceptions.UnsupportedPlatformException(("VBox: " + path));
}