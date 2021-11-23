private void addTerms(java.lang.String item, java.util.List<org.phenotips.ontology.OntologyTerm> holder) {
    if (org.apache.commons.lang3.StringUtils.isNotBlank(item)) {
        org.phenotips.ontology.OntologyTerm term = this.ontologyManager.resolveTerm(item);
        if (term != null) {
            holder.add(term);
        }
    }
}