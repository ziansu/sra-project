private java.net.URI getURI(com.stratelia.webactiv.publication.model.PublicationDetail publication) {
    java.lang.String baseUri = super.getUriInfo().getAbsolutePath().toString();
    java.net.URI uri;
    try {
        uri = new java.net.URI(((baseUri + "/publication/") + (publication.getPK().getId())));
    } catch (java.net.URISyntaxException e) {
        java.util.logging.Logger.getLogger(org.silverpeas.publication.web.AbstractPublicationResource.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        throw new java.lang.RuntimeException(e.getMessage(), e);
    }
    return uri;
}