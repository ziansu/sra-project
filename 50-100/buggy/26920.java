private java.lang.String getFileLocation(java.lang.String fileName) {
    java.lang.String ret = null;
    java.net.URL lurl = org.apache.ranger.authorization.hadoop.config.RangerConfiguration.class.getClassLoader().getResource(fileName);
    if (lurl == null) {
        lurl = org.apache.ranger.authorization.hadoop.config.RangerConfiguration.class.getClassLoader().getResource(("/" + fileName));
    }
    if (lurl != null) {
        ret = lurl.getFile();
    }
    return ret;
}