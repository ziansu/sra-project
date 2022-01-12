private void pluginChanged(jobdispatcher.plugin.Plugin curPlugin) {
    if (curPlugin.getName().startsWith("zh_def_catalog")) {
        mapTagTemplate1.put("SceneMetaDataFile", objectivePath);
        mapTagTemplate2.remove("SceneMetaDataFile");
    }else {
        mapTagTemplate1.remove("SceneMetaDataFile");
        mapTagTemplate2.put("SceneMetaDataFile", ((frameFilePath) + "_meta.xml"));
    }
}