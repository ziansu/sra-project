public final void recomputeStructure() {
    org.openflexo.ontology.components.widget.OntologyBrowserModel.logger.fine(("BEGIN recomputeStructure for " + (getContext())));
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
    org.openflexo.ontology.components.widget.OntologyBrowserModel.logger.fine(("END recomputeStructure for " + (getContext())));
}