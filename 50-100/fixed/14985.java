private static void setMaprTicketPropertiesConfig(org.talend.repository.model.hadoopcluster.HadoopClusterConnection hcConnection) {
    boolean setMapRHomeDir = hcConnection.isSetMaprTHomeDir();
    java.lang.String mapRHomeDir = hcConnection.getMaprTHomeDir();
    java.lang.System.setProperty("pname", "MapRLogin");
    java.lang.System.setProperty("https.protocols", "TLSv1.2");
    java.lang.System.setProperty("mapr.home.dir", (setMapRHomeDir ? mapRHomeDir : "/opt/mapr"));
}