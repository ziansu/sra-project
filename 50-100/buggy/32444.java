public thredds.client.catalog.builder.Catalog buildFromCatref(thredds.client.catalog.builder.CatalogRef catref) throws java.io.IOException {
    java.net.URI catrefURI = catref.getURI();
    if (catrefURI == null) {
        errlog.format("Catref doesnt have valid UrlPath=%s%n", catref.getUrlPath());
        fatalError = true;
        return null;
    }
    this.baseURI = catrefURI;
    thredds.client.catalog.builder.Catalog result = buildFromURI(catrefURI);
    catref.setRead((!(fatalError)));
    return result;
}