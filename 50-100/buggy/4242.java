@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    forceTabsCleaning();
    if ((this.modal) != null) {
        this.modal.hide();
    }
    this.setSelectedAnchorListItem(this.wires);
    this.contentPanel.setVisible(true);
    this.contentPanelHeader.setText(org.eclipse.kura.web.client.ui.EntryClassUi.MSGS.wires());
    this.contentPanelBody.clear();
    this.contentPanelBody.add(this.wiresBinder);
    org.eclipse.kura.web.client.ui.wires.WiresPanelUi.load();
    this.discardWiresPanelChanges();
}