@java.lang.Override
protected void initialiseOWLView() throws java.lang.Exception {
    obdaModelManager = ((org.semanticweb.ontop.protege.core.OBDAModelManager) (getOWLEditorKit().get(it.unibz.krdb.obda.model.impl.OBDAModelImpl.class.getName())));
    obdaModelManager.addListener(this);
    org.protege.editor.owl.model.OWLModelManager owlModelManager = getOWLEditorKit().getOWLModelManager();
    setLayout(new java.awt.BorderLayout());
    editor = new org.semanticweb.ontop.protege.panels.DatasourceParameterEditorPanel(obdaModelManager.getActiveOBDAModel(), owlModelManager);
    add(editor, java.awt.BorderLayout.NORTH);
    org.semanticweb.ontop.protege.views.DatasourcesManagerView.log.debug("Datasource browser initialized");
}