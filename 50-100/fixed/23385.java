org.geoserver.wfs.StoredQuery parseStoredQuery(java.io.File file, org.geotools.xml.Parser p) throws java.lang.Exception {
    p.setRootElementType(WFS.StoredQueryDescriptionType);
    java.io.FileInputStream fin = new java.io.FileInputStream(file);
    try {
        net.opengis.wfs20.StoredQueryDescriptionType q = ((net.opengis.wfs20.StoredQueryDescriptionType) (p.parse(new java.io.BufferedInputStream(fin))));
        return createStoredQuery(q, false);
    } finally {
        fin.close();
    }
}