public void validateWorkOrPeerReview(org.orcid.jaxb.model.record_rc2.ExternalID id) {
    try {
        org.orcid.jaxb.model.message.WorkExternalIdentifierType t = org.orcid.jaxb.model.message.WorkExternalIdentifierType.fromValue(id.getType().toLowerCase());
    } catch (java.lang.IllegalArgumentException e) {
        checkAndThrow(org.apache.jena.ext.com.google.common.collect.Lists.newArrayList(id.getType()));
    }
}