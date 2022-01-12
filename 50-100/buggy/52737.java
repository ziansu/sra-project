public void annotate(uk.ac.ebi.fg.core_model.expgraph.properties.ExperimentalPropertyValue<uk.ac.ebi.fg.core_model.expgraph.properties.ExperimentalPropertyType> pval, boolean isNumberOrDate) {
    if (pval == null)
        return ;
    
    org.apache.commons.lang3.tuple.Pair<java.lang.String, java.lang.String> pair = uk.ac.ebi.fg.biosd.annotator.model.ExpPropValAnnotation.getTypeAndVal(pval);
    if (pair == null)
        return ;
    
    java.lang.String pvalTypeLabel = pair.getLeft();
    java.lang.String pvalLabel = pair.getRight();
    if (isNumberOrDate && (pvalTypeLabel != null))
        ontoTermDiscoverer.getOntologyTerms(pvalTypeLabel, null);
    else
        ontoTermDiscoverer.getOntologyTerms(pvalLabel, pvalTypeLabel);
    
}