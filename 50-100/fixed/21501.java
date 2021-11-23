public static org.intermine.bio.dataconversion.IdResolver getIdResolverByOrganism(java.util.Set<java.lang.String> taxonIds) {
    org.intermine.bio.dataconversion.IdResolverService.getWormIdResolver();
    org.intermine.bio.dataconversion.IdResolverService.getHumanIdResolver();
    java.util.Set<java.lang.String> validTaxonIds = new java.util.HashSet<java.lang.String>(taxonIds);
    validTaxonIds.remove("6239");
    return new org.intermine.bio.dataconversion.EntrezGeneIdResolverFactory().getIdResolver(validTaxonIds);
}