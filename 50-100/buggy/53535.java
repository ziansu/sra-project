@java.lang.SuppressWarnings(value = "PMD.SignatureDeclareThrowsException")
public void movePluginFromTemp(java.lang.String tempFileName) throws java.lang.Exception {
    if (tempFileName == null) {
        return ;
    }
    java.io.File temp = new java.io.File(tempFileName);
    java.io.File pluginFile = new java.io.File(((((configPath) + "plugins") + (java.io.File.separator)) + (pluginName)));
    org.mifos.test.acceptance.util.PluginsUtil.copyFile(temp, pluginFile);
    temp.delete();
}