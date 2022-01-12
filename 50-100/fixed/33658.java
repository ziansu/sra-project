static int getInt(java.lang.String key, int defaultValue) {
    java.lang.String value = ibcontroller.Settings._Props.getProperty(key);
    if ((value == null) || ((value.length()) == 0)) {
        return defaultValue;
    }
    try {
        return java.lang.Integer.parseInt(value);
    } catch (java.lang.NumberFormatException e) {
        ibcontroller.Utils.logToConsole((((("Invalid number \"" + value) + "\" for property \"") + key) + "\""));
        return defaultValue;
    }
}