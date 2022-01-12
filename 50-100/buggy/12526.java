private java.lang.String getFormattedMessage(java.lang.String key, java.lang.Object... data) {
    java.lang.String message = null;
    try {
        message = messageBundle.getString(key);
    } catch (java.util.MissingResourceException ex) {
        return (key + " ") + (java.util.Arrays.toString(data));
    }
    return java.text.MessageFormat.format(message, data);
}