public org.pathwaycommons.pcviz.model.GeneValidation validate(java.lang.String name) {
    org.pathwaycommons.pcviz.model.GeneValidation geneValidation = new org.pathwaycommons.pcviz.model.GeneValidation();
    geneValidation.setQuery(name);
    java.util.Set<java.lang.String> names = geneMaps.get(name.toUpperCase());
    if (names != null)
        geneValidation.getMatches().addAll(names);
    
    return geneValidation;
}