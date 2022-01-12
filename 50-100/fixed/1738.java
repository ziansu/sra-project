public void performAction(com.vp.plugin.action.VPAction arg0) {
    br.ufes.inf.nemo.mltplugin.LogUtilitary.log((("Reloading again " + (br.ufes.inf.nemo.mltplugin.MLTPlugin.PLUGIN_ID)) + "..."));
    com.vp.plugin.ApplicationManager.instance().reloadPluginClasses(MLTPlugin.PLUGIN_ID);
    br.ufes.inf.nemo.mltplugin.LogUtilitary.clearValidationLog();
    br.ufes.inf.nemo.mltplugin.LogUtilitary.log((("Reloading complete! [" + (new java.util.Date())) + "]"));
}