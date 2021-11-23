@java.lang.Override
protected org.eclipse.swt.widgets.Control createDialogArea(org.eclipse.swt.widgets.Composite parent) {
    setMessage("Neue Befundvorlage anlegen");
    setTitle("Befund Vorlage");
    findingsDetailComposite = new ch.elexis.core.findings.templates.ui.composite.FindingsDetailComposite(parent, model);
    findingsDetailComposite.createContents();
    ch.elexis.core.findings.templates.model.FindingsTemplate findingsTemplate = ModelFactory.eINSTANCE.createFindingsTemplate();
    findingsTemplate.setTitle("");
    findingsTemplate.setType(Type.OBSERVATION_VITAL);
    findingsTemplate.setInputData(ModelFactory.eINSTANCE.createInputDataNumeric());
    findingsDetailComposite.setSelection(model, findingsTemplate);
    return findingsDetailComposite;
}