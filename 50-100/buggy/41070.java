public static java.lang.String decodeClassName(java.lang.String iClassName) {
    if (iClassName == null)
        return null;
    
    if ((iClassName.charAt(0)) == '-')
        iClassName = iClassName.substring(1);
    
    try {
        return java.net.URLDecoder.decode(iClassName.replaceAll("_", "%"), "UTF-8");
    } catch (java.io.UnsupportedEncodingException e) {
        com.orientechnologies.common.log.OLogManager.instance().error(null, "Error on decoding class name using encoding '%s'", e, "UTF-8");
        return iClassName;
    }
}