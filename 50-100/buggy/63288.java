@java.lang.Override
public void onSelect(com.sencha.gxt.widget.core.client.event.SelectEvent event) {
    org.iplantc.de.client.models.tool.Tool tool = detailsPanel.getTool();
    if (detailsPanel.isValid()) {
        presenter.updateTool(tool);
        dialogWindow.hide();
        try {
            grid.getSelectionModel().deselect(grid.getSelectionModel().getSelectedItem());
        } catch (com.google.gwt.event.shared.UmbrellaException umb) {
        }
    }else {
        com.sencha.gxt.widget.core.client.box.AlertMessageBox alertMsgBox = new com.sencha.gxt.widget.core.client.box.AlertMessageBox("Warning", appearance.publicSubmitError());
        alertMsgBox.show();
    }
}