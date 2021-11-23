private static co.cask.cdap.api.plugin.PluginClass getPluginClass() {
    java.util.Map<java.lang.String, co.cask.cdap.api.plugin.PluginPropertyField> properties = new java.util.HashMap<>();
    properties.put("field", new co.cask.cdap.api.plugin.PluginPropertyField("field", "", "string", true, false));
    properties.put("value", new co.cask.cdap.api.plugin.PluginPropertyField("value", "", "string", true, false));
    return new co.cask.cdap.api.plugin.PluginClass(co.cask.cdap.etl.api.Transform.PLUGIN_TYPE, "StringValueFilter", "", co.cask.cdap.etl.mock.transform.StringValueFilterTransform.class.getName(), "config", properties);
}