public static java.lang.String getVersion() {
    if ((net.rptools.maptool.client.MapTool.version) == null) {
        net.rptools.maptool.client.MapTool.version = "DEVELOPMENT";
        try {
            if ((net.rptools.maptool.client.MapTool.class.getClassLoader().getResource(net.rptools.maptool.client.MapTool.VERSION_TXT)) != null) {
                net.rptools.maptool.client.MapTool.version = new java.lang.String(net.rptools.lib.FileUtil.loadResource(net.rptools.maptool.client.MapTool.VERSION_TXT)).trim();
            }
        } catch (java.io.IOException ioe) {
            java.lang.String msg = net.rptools.maptool.language.I18N.getText("msg.info.versionFile", net.rptools.maptool.client.MapTool.VERSION_TXT);
            net.rptools.maptool.client.MapTool.version = msg;
            net.rptools.maptool.client.MapTool.showError("msg.error.versionFileMissing");
        }
    }
    return net.rptools.maptool.client.MapTool.version;
}