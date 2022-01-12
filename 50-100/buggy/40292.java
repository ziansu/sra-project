public org.exist.xmldb.XmldbURI lastSegment() {
    java.lang.String name = getRawCollectionPath();
    int last;
    if ((last = name.lastIndexOf('/')) == (org.exist.xquery.Constants.STRING_NOT_FOUND)) {
        return this;
    }
    if (last == ((name.length()) - 1)) {
        name = name.substring(0, last);
        last = name.lastIndexOf('/');
    }
    return org.exist.xmldb.XmldbURI.create(name.substring((last + 1)));
}