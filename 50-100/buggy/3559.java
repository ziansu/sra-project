public static java.lang.Object get(java.lang.String key) {
    if ((net.sf.memoranda.util.Configuration.config.get(key)) == null) {
        java.lang.System.out.println((("Configuration: Key '" + key) + "' not found."));
        return "";
    }
    if ((key == "BASE_FONT_SIZE") && ((net.sf.memoranda.util.Configuration.config.get(key).toString()) == "")) {
        net.sf.memoranda.util.Configuration.config.put("BASE_FONT_SIZE", "16");
    }
    return net.sf.memoranda.util.Configuration.config.get(key);
}