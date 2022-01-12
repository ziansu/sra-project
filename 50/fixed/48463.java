private void createSaveIntervalSections() {
    this.createSectionLabel("Save Interval");
    final org.eclipse.swt.widgets.Composite composite = this.createHorizontalLayoutComposite();
    com.laboki.eclipse.plugin.smartsave.preferences.ui.PreferencesPage.createLabel(composite, "If possible try to save &files every: ");
    new com.laboki.eclipse.plugin.smartsave.preferences.ui.SaveIntervalButton(composite).begin();
}