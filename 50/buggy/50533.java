public void actionPerformed(final java.awt.event.ActionEvent event) {
    MODEL.setUseFieldReadback(false);
    CONFIG_PVLOGGER_DATA.actionPerformed(null);
    MODEL.modelScenarioChanged();
    setHasChanges(true);
}