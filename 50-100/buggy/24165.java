public static org.openrdf.rio.RDFFormat requestedContentType(java.lang.String contentType) {
    org.openrdf.rio.RDFFormat requesetedContentType = null;
    if (((contentType.contentEquals(RDFFormat.TURTLE.getDefaultMIMEType())) || (contentType == null)) || (contentType.contains(MediaType.ALL_VALUE))) {
        requesetedContentType = org.openrdf.rio.RDFFormat.TURTLE;
    }else
        if (contentType.contentEquals(RDFFormat.JSONLD.getDefaultMIMEType())) {
            requesetedContentType = org.openrdf.rio.RDFFormat.JSONLD;
        }
    
    return requesetedContentType;
}