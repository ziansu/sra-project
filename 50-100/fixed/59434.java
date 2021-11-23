private void btnBatchEditActionPerformed(java.awt.event.ActionEvent evt) {
    java.lang.String tabName = getSelectedTabName();
    com.elle.analyster.logic.Tab tab = tabs.get(tabName);
    tab.setEditing(true);
    makeTableEditable(true);
    editModeTextColor(tab.isEditing());
    batchEditWindow = new com.elle.analyster.presentation.BatchEditWindow();
    batchEditWindow.setVisible(true);
    tab.setBatchEditWindowVisible(true);
    tab.setBatchEditWindowOpen(true);
    tab.setBatchEditBtnEnabled(false);
    setBatchEditButtonStates(tab);
}