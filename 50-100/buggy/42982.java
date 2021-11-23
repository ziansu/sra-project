protected void setMaprTicketPropertiesConfig(org.talend.designer.hdfsbrowse.hadoop.service.HadoopServiceProperties serviceProperties) {
    boolean setMapRHomeDir = serviceProperties.isSetMaprTHomeDir();
    java.lang.String mapRHomeDir = serviceProperties.getMaprTHomeDir();
    boolean setMapRHadoopLogin = serviceProperties.isSetHadoopLogin();
    java.lang.String mapRHadoopLogin = serviceProperties.getMaprTHadoopLogin();
    java.lang.System.setProperty("pname", "MapRLogin");
    java.lang.System.setProperty("https.protocols", "TLSv1.2");
    java.lang.System.setProperty("mapr.home.dir", (setMapRHomeDir ? mapRHomeDir : "/opt/mapr"));
    java.lang.System.setProperty("hadoop.login", (setMapRHadoopLogin ? mapRHadoopLogin : "kerberos"));
}