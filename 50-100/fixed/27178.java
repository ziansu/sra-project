private void setHidden(java.lang.String file) {
    if (java.lang.System.getProperty("os.name").toLowerCase().contains("windows")) {
        try {
            java.lang.Runtime.getRuntime().exec(("attrib +H " + file));
        } catch (java.io.IOException ex) {
            org.silverpeas.core.util.logging.SilverLogger.getLogger(this).warn(ex);
        }
    }
}