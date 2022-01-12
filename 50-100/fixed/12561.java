public void setIncomingPortletCandidate(final org.vaadin.addons.portallayout.gwt.client.portlet.PortletChrome portletWidget) {
    assert portletWidget != null;
    final com.vaadin.client.ComponentConnector pc = com.vaadin.client.Util.findConnectorFor(portletWidget.getContentWidget());
    if ((outcomingPortletCandidate) == pc) {
        outcomingPortletCandidate = null;
    }else
        if (!(getChildComponents().contains(pc))) {
            incomingPortletCandidate = pc;
        }
    
}