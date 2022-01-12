private java.lang.Boolean getBooleanSetting(java.lang.String setting, java.lang.Boolean fallback) {
    java.lang.String val = burp.BurpExtender.getInstance().getCallbacks().loadExtensionSetting(setting);
    try {
        return java.lang.Boolean.valueOf(val);
    } catch (java.lang.NullPointerException nPException) {
        return fallback;
    }
}