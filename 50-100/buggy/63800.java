public static java.lang.String normaliseUri(java.lang.String context, java.lang.String partURI) {
    if ((null == partURI) || (partURI.contains("javascript:"))) {
        return null;
    }
    java.net.URI uri;
    try {
        uri = new java.net.URI(context);
        return uri.resolve(partURI).toString();
    } catch (java.lang.Exception e) {
        fts.bean.PageParser.log.equals(("Error in " + partURI));
    }
    return null;
}