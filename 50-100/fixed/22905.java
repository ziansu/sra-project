public static void createProperties(java.lang.String filename, java.util.Properties prop) {
    try {
        me.pandaism.api.Configuration.file = new java.io.File((filename + ".properties"));
        me.pandaism.api.Configuration.output = new java.io.FileOutputStream(me.pandaism.api.Configuration.file, true);
        me.pandaism.api.Configuration.prop = prop;
    } catch (java.io.FileNotFoundException e) {
        e.printStackTrace();
    }
}