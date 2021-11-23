public static java.lang.String extractPersistentId(java.net.URI objURI) {
    java.lang.String URIstr = objURI.toString();
    java.util.regex.Pattern r = java.util.regex.Pattern.compile(org.sbolstandard.core2.URIcompliance.genericURIpattern1);
    java.util.regex.Matcher m = r.matcher(URIstr);
    if (m.matches()) {
        return m.group(1).substring(0, m.group(1).lastIndexOf('/'));
    }else {
        return null;
    }
}