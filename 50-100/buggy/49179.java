public static int getConfigInt(java.util.Properties config, java.lang.String key, int def) {
    int vint = def;
    try {
        java.lang.String val = config.getProperty(key);
        if (val != null) {
            def = java.lang.Integer.parseInt(val);
        }
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    return vint;
}