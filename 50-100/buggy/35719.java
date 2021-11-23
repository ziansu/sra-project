private java.lang.String doBackwardPathOnly(final org.fcrepo.kernel.models.FedoraResource resource) {
    java.lang.String path = reverse.convert(org.fcrepo.http.commons.api.rdf.HttpResourceConverter.getPath(resource));
    if (path != null) {
        if (resource instanceof org.fcrepo.kernel.models.NonRdfSourceDescription) {
            path = (path + "/") + (org.fcrepo.kernel.FedoraJcrTypes.FCR_METADATA);
        }
        if (path.endsWith(org.modeshape.jcr.api.JcrConstants.JCR_CONTENT)) {
            path = org.apache.commons.lang.StringUtils.replaceOnce(path, ("/" + (org.modeshape.jcr.api.JcrConstants.JCR_CONTENT)), org.apache.commons.lang.StringUtils.EMPTY);
        }
        return path;
    }
    throw new org.fcrepo.kernel.exception.RepositoryRuntimeException(("Unable to process reverse chain for resource " + resource));
}