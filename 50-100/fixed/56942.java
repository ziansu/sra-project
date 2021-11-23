private void applyCssClasses(java.util.Map<java.lang.String, java.lang.Object> configProps) {
    cssClassList.clear();
    for (java.lang.String key : org.eclipse.smarthome.ui.basic.internal.WebAppConfig.cssClasses.keySet()) {
        java.lang.Boolean value = org.eclipse.smarthome.ui.basic.internal.WebAppConfig.cssDefaultValues.get(key);
        if (configProps.containsKey(key)) {
            value = configProps.get(key).toString().equalsIgnoreCase("true");
        }
        if (value) {
            cssClassList.add(org.eclipse.smarthome.ui.basic.internal.WebAppConfig.cssClasses.get(key));
        }
    }
}