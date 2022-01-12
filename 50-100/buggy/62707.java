public static java.lang.String encodeClassName(java.lang.String iClassName) {
    if (iClassName == null)
        return null;
    
    if (java.lang.Character.isDigit(iClassName.charAt(0)))
        iClassName = "-" + iClassName;
    
    try {
        return java.net.URLEncoder.encode(iClassName, "UTF-8").replaceAll("\\.", "%2E").replaceAll("_", "%5F").replaceAll("\\%", "_");
    } catch (java.io.UnsupportedEncodingException e) {
        com.orientechnologies.common.log.OLogManager.instance().error(null, "Error on encoding class name using encoding '%s'", e, "UTF-8");
        return iClassName;
    }
}