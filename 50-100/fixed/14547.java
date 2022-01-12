public java.util.Map<java.lang.String, java.lang.String> getValue() {
    java.util.Map<java.lang.String, java.lang.String> ret = new java.util.HashMap<java.lang.String, java.lang.String>();
    for (org.roda.wui.client.ingest.process.PluginParameterPanel panel : panels) {
        java.lang.String key = panel.getParameter().getId();
        java.lang.String value = panel.getValue();
        if (value != null) {
            ret.put(key, value);
        }
    }
    return ret;
}