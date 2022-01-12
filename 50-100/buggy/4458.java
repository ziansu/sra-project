public thredds.client.catalog.builder.Catalog buildFromLocation(java.lang.String location, java.net.URI baseURI) throws java.io.IOException {
    location = ucar.unidata.util.StringUtil2.replace(location, "\\", "/");
    if (baseURI == null) {
        try {
            baseURI = new java.net.URI(location);
        } catch (java.net.URISyntaxException e) {
            errlog.format("Bad location = '%s' err='%s'%n", location, e.getMessage());
            fatalError = true;
            return null;
        }
    }
    this.baseURI = baseURI;
    readXML(location);
    return makeCatalog();
}