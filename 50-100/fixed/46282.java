protected void logBuildInfo() {
    try {
        java.net.URL u = com.google.common.io.Resources.getResource("lemur.build.date");
        java.lang.String build = com.google.common.io.Resources.toString(u, com.google.common.base.Charsets.UTF_8);
        com.simsilica.lemur.GuiGlobals.log.info(("Lemur build date:" + build));
    } catch (java.lang.Exception e) {
        com.simsilica.lemur.GuiGlobals.log.error("Error reading build info", e);
    }
}