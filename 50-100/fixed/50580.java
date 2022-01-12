public org.protege.editor.core.ui.view.ViewComponent newInstance() throws java.lang.ClassNotFoundException, java.lang.IllegalAccessException, java.lang.InstantiationException {
    viewComponent = new org.sealife.skos.editor.views.SKOSConceptListViewComponent(false) {
        protected void setupActions() {
            if (isEditable()) {
                super.setupActions();
            }
        }

        protected java.util.Set<org.semanticweb.owlapi.model.OWLOntology> getOntologies() {
            if ((ontologies) != null) {
                return ontologies;
            }
            return super.getOntologies();
        }
    };
    viewComponent.setup(this);
    return viewComponent;
}