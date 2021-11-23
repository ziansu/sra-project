public java.lang.String getName(java.net.URI contextURI) {
    org.entrystore.repository.util.URISplit us = new org.entrystore.repository.util.URISplit(contextURI, this.entry.getRepositoryManager().getRepositoryURL());
    if ((us.getURIType()) == (org.entrystore.repository.util.URISplit.URIType.Resource)) {
        return super.getName(us.getMetaMetadataURI());
    }
    throw new org.openrdf.repository.RepositoryException("Given URI is not an existing contextURI.");
}