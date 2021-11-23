private void convertToGSEA(cpath.service.Model m, java.io.OutputStream stream, java.util.Map<java.lang.String, java.lang.String> options) throws java.io.IOException {
    java.lang.String idType;
    if ((idType = options.get("db")) == null)
        idType = "uniprot";
    
    org.biopax.paxtools.io.gsea.GSEAConverter gseaConverter = new org.biopax.paxtools.io.gsea.GSEAConverter(idType, true, true);
    java.util.Set<java.lang.String> allowedTaxIds = cpath.config.CPathSettings.getInstance().getOrganismTaxonomyIds();
    gseaConverter.setAllowedOrganisms(allowedTaxIds);
    gseaConverter.setSkipOutsidePathways(true);
    gseaConverter.writeToGSEA(m, stream);
}