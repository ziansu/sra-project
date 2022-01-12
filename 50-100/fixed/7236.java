@java.lang.Override
public boolean execute() {
    formDesignerPanel.getSaveButton().setText(I18N.CONSTANTS.save());
    formDesignerPanel.getSaveButton().setEnabled(true);
    formDesignerPanel.getStatusMessage().setHTML(I18N.CONSTANTS.saved());
    formDesigner.getSavedGuard().setSaved(true);
    return false;
}