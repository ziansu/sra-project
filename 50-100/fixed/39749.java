public void selectionChanged() throws java.lang.Exception {
    final org.semanticweb.owlapi.model.OWLObject owlObject = getOWLWorkspace().getOWLSelectionModel().getSelectedObject();
    if (owlObject == null) {
        return ;
    }
    java.util.Set<org.semanticweb.owlapi.model.OWLClass> oc = owlObject.getClassesInSignature();
    java.util.Iterator<org.semanticweb.owlapi.model.OWLClass> classes = oc.iterator();
    if (classes.hasNext())
        getTree().setSelectedOWLObject(classes.next());
    
}