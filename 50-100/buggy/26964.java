protected static com.samskivert.util.Config makeConfig(java.lang.String propsId) {
    java.util.Properties props = new java.util.Properties();
    java.lang.String path = com.samskivert.enormous.EnormousConfig.getPath((propsId + ".properties"));
    try {
        props.load(new java.io.FileInputStream(path));
    } catch (java.io.IOException ioe) {
        java.lang.System.err.println(((("Error loading '" + path) + "': ") + ioe));
    }
    return new com.samskivert.util.Config(propsId, props);
}