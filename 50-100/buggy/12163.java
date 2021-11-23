public void setOutcomingPortletCandidate(org.vaadin.addons.portallayout.gwt.client.portlet.PortletChrome portletWidget) {
    assert portletWidget != null;
    com.vaadin.client.ComponentConnector pc = com.vaadin.client.Util.findConnectorFor(portletWidget.getContentWidget());
    if ((this.incomingPortletCandidate) == pc) {
        this.incomingPortletCandidate = null;
    }else
        if (getChildComponents().contains(pc)) {
            this.outcomingPortletCandidate = pc;
        }
    
}