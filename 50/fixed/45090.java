public void actionPerformed(final java.awt.event.ActionEvent event) {
    MODEL.setUseFieldReadback(true);
    MODEL.modelScenarioChanged();
    setHasChanges(true);
}