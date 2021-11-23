public java.util.ArrayList<rifGenericLibrary.taxonomyServices.TaxonomyTerm> getImmediateChildTerms(final java.lang.String parentTermIdentifier) throws rifGenericLibrary.system.RIFServiceException {
    java.util.ArrayList<rifGenericLibrary.taxonomyServices.TaxonomyTerm> results = new java.util.ArrayList<rifGenericLibrary.taxonomyServices.TaxonomyTerm>();
    if (parentTermIdentifier == null) {
        return results;
    }
    rifGenericLibrary.taxonomyServices.TaxonomyTerm parentTerm = getTerm(parentTermIdentifier);
    if (parentTerm == null) {
        rifGenericLibrary.system.RIFServiceExceptionFactory rifServiceExceptionFactory = new rifGenericLibrary.system.RIFServiceExceptionFactory();
        rifServiceExceptionFactory.createNonExistentTaxonomyTerm(taxonomyServiceID, parentTermIdentifier);
    }
    return parentTerm.getChildTerms();
}