private org.openrdf.model.Model parseRdf(final org.restlet.representation.Representation rep) throws com.github.podd.client.api.PoddClientException, java.io.IOException {
    final org.openrdf.rio.RDFFormat format = org.openrdf.rio.Rio.getParserFormatForMIMEType(rep.getMediaType().getName());
    if (format == null) {
        throw new com.github.podd.client.api.PoddClientException(("Did not understand the format for the RDF response: " + (rep.getMediaType().getName())));
    }
    try {
        return org.openrdf.rio.Rio.parse(rep.getStream(), "", format);
    } catch (org.openrdf.rio.RDFParseException | org.openrdf.rio.UnsupportedRDFormatException e) {
        throw new com.github.podd.client.api.PoddClientException("There was an error parsing the artifact", e);
    }
}