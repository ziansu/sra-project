private static co.cask.cdap.api.plugin.PluginClass getPluginClass() {
    java.util.Map<java.lang.String, co.cask.cdap.api.plugin.PluginPropertyField> properties = new java.util.HashMap<>();
    properties.put("tableName", new co.cask.cdap.api.plugin.PluginPropertyField("tableName", "", "string", true, false));
    return new co.cask.cdap.api.plugin.PluginClass(co.cask.cdap.etl.api.batch.BatchSink.PLUGIN_TYPE, "MockRuntime", "", co.cask.cdap.etl.mock.batch.MockRuntimeDatasetSink.class.getName(), "config", properties);
}