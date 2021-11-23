public java.util.Set<org.semanticweb.owlapi.model.OWLAxiom> getSelectedAxioms() {
    if (((selectedExistingAxioms) != null) && (!(selectedExistingAxioms.isEmpty()))) {
        selectedExistingAxioms.addAll(selectedNewAxioms);
        return selectedExistingAxioms;
    }
    return selectedNewAxioms;
}