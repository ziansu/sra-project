private void pluginChanged(jobdispatcher.plugin.Plugin curPlugin) {
    if (curPlugin.getName().startsWith("zh_def_catalog")) {
        mapTagTemplate1.put("SceneMetaDataFile", objectivePath);
    }else {
        mapTagTemplate2.put("SceneMetaDataFile", ((frameFilePath) + "_meta.xml"));
    }
}