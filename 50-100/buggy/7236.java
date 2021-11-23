@java.lang.Override
public void onSuccess(java.lang.Void result) {
    formDesignerPanel.getSaveButton().setText(I18N.CONSTANTS.save());
    formDesignerPanel.getSaveButton().setEnabled(true);
    formDesignerPanel.getStatusMessage().setHTML(I18N.CONSTANTS.saved());
    formDesigner.getSavedGuard().setSaved(true);
}