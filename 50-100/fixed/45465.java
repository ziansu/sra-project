@java.lang.Override
protected void createFieldEditors() {
    ch.elexis.core.findings.templates.model.FindingsTemplates model = FindingsServiceHolder.findingsTemplateService.getFindingsTemplates("Standard Vorlagen");
    findingsComposite = new ch.elexis.core.findings.templates.ui.composite.FindingsComposite(getFieldEditorParent(), model);
    ch.elexis.core.findings.templates.ui.composite.FindingsDetailComposite findingsDetailComposite = new ch.elexis.core.findings.templates.ui.composite.FindingsDetailComposite(getFieldEditorParent(), model, false);
    findingsComposite.setFindingsDetailComposite(findingsDetailComposite);
    findingsComposite.createContents();
    findingsDetailComposite.createContents();
    findingsComposite.selectFirstTreeElement();
}