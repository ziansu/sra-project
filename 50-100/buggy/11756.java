private rifServices.businessConceptLayer.HealthCode transformTaxonomyTermIntoHealthCode(rifServices.taxonomyServices.TaxonomyTerm term) {
    rifServices.businessConceptLayer.HealthCode healthCode = rifServices.businessConceptLayer.HealthCode.newInstance();
    healthCode.setCode(term.getLabel());
    healthCode.setTopLevelTerm(((term.getParentTerm()) == null));
    healthCode.setNameSpace(term.getNameSpace());
    healthCode.setDescription(term.getDescription());
    healthCode.setNumberOfSubTerms(term.getSubTerms().size());
    return healthCode;
}