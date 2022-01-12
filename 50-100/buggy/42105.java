protected java.lang.String getPrefixlessIdentifier(java.lang.String identifier) {
    java.lang.String splitter = "";
    if (identifier.startsWith(Constants.URN)) {
        splitter = org.n52.sos.util.Constants.COLON_STRING;
    }else
        if (identifier.startsWith(Constants.HTTP)) {
            splitter = org.n52.sos.util.Constants.SLASH_STRING;
        }
    
    return identifier.substring(((identifier.lastIndexOf(splitter)) + 1));
}