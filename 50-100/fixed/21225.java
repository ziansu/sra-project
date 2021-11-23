public final void recomputeStructure() {
    org.openflexo.ontology.components.widget.OntologyBrowserModel.logger.info(("BEGIN recomputeStructure for " + (getContext())));
    isRecomputingStructure = true;
    if ((getContext()) != null) {
        if (getHierarchicalMode()) {
            computeHierarchicalStructure();
        }else {
            computeNonHierarchicalStructure();
        }
    }
    getPropertyChangeSupport().firePropertyChange("roots", null, roots);
    isRecomputingStructure = false;
    org.openflexo.ontology.components.widget.OntologyBrowserModel.logger.info(("END recomputeStructure for " + (getContext())));
}