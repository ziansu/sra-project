private java.net.URL getFileLocation(java.lang.String fileName) {
    java.net.URL lurl = org.apache.ranger.authorization.hadoop.config.RangerConfiguration.class.getClassLoader().getResource(fileName);
    if (lurl == null) {
        lurl = org.apache.ranger.authorization.hadoop.config.RangerConfiguration.class.getClassLoader().getResource(("/" + fileName));
    }
    return lurl;
}