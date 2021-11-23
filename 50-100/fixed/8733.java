public static void setOmHome() {
    java.lang.String webappsDir = java.lang.System.getProperty("om.home", ".");
    org.apache.openmeetings.util.OmFileHelper.setOmHome(webappsDir);
    if ((!(org.apache.openmeetings.util.OmFileHelper.getOmHome().exists())) || (!(org.apache.openmeetings.util.OmFileHelper.getOmHome().isDirectory()))) {
        org.junit.Assert.fail(("Invalid directory is specified as OM HOME: " + webappsDir));
    }
}