public java.lang.String getString(java.lang.String arg, java.lang.String defaultValue) {
    try {
        return getString(arg);
    } catch (java.lang.NullPointerException e) {
        return defaultValue;
    }
}