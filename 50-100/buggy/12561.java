public void setIncomingPortletCandidate(org.vaadin.addons.portallayout.gwt.client.portlet.PortletChrome portletWidget) {
    assert portletWidget != null;
    com.vaadin.client.ComponentConnector pc = com.vaadin.client.Util.findConnectorFor(portletWidget.getContentWidget());
    if ((this.outcomingPortletCandidate) == pc) {
        this.outcomingPortletCandidate = null;
    }else
        if (!(getChildComponents().contains(pc))) {
            this.incomingPortletCandidate = pc;
        }
    
}