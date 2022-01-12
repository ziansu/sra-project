@java.lang.Override
public void onClick(com.google.gwt.event.dom.client.ClickEvent event) {
    forceTabsCleaning();
    if ((this.modal) != null) {
        this.modal.hide();
    }
    this.setSelectedAnchorListItem(this.firewall);
    this.contentPanel.setVisible(true);
    this.contentPanelHeader.setText(org.eclipse.kura.web.client.ui.EntryClassUi.MSGS.firewall());
    this.contentPanelBody.clear();
    this.contentPanelBody.add(this.firewallBinder);
    this.firewallBinder.initFirewallPanel();
}