org.geoserver.wfs.StoredQuery parseStoredQuery(org.geoserver.platform.resource.Resource file, org.geotools.xml.Parser p) throws java.lang.Exception {
    p.setRootElementType(WFS.StoredQueryDescriptionType);
    java.io.InputStream fin = file.in();
    try {
        net.opengis.wfs20.StoredQueryDescriptionType q = ((net.opengis.wfs20.StoredQueryDescriptionType) (p.parse(new java.io.BufferedInputStream(fin))));
        return createStoredQuery(q);
    } finally {
        fin.close();
    }
}