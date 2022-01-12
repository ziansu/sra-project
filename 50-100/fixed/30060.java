private void showSettingsAttributeWeights() {
    if ((this.viewAttributeWeights) == null) {
        org.eclipse.swt.widgets.Composite composite1 = folder.createItem(org.deidentifier.arx.gui.resources.Resources.getMessage("CriterionDefinitionView.63"), null);
        composite1.setLayout(new org.eclipse.swt.layout.FillLayout());
        this.viewAttributeWeights = new org.deidentifier.arx.gui.view.impl.define.ViewAttributeWeights(composite1, controller);
    }
    this.viewAttributeWeights.update(new org.deidentifier.arx.gui.model.ModelEvent(this, org.deidentifier.arx.gui.model.ModelEvent.ModelPart.MODEL, this.model));
}