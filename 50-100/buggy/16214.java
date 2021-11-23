@java.lang.Override
public void onValueChange(com.google.gwt.event.logical.shared.ValueChangeEvent<java.lang.Boolean> event) {
    serverRefCombo.setEnabled(true);
    relativePath.setEnabled(true);
    fileName.setEnabled(true);
    uploader.setEnabled(false);
    checkAccessButton.setEnabled(true);
    statusLabel.setText(edu.scripps.yates.client.gui.components.projectCreatorWizard.ObjectPanels.DataSourceDisclosurePanel.SELECT_A_SERVER_AND_THE_PATH);
    statusLabel.setStyleName("DataSourceDisclosurePanelRedLabel");
    registerFileNameWithTypeBeanOnServer();
    if ((serverRefCombo.getItemCount()) == 2) {
        serverRefCombo.setItemSelected(1, true);
    }
    fireModificationEvent();
}