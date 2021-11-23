public void setOutcomingPortletCandidate(final org.vaadin.addons.portallayout.gwt.client.portlet.PortletChrome portletWidget) {
    assert portletWidget != null;
    final com.vaadin.client.ComponentConnector pc = com.vaadin.client.Util.findConnectorFor(portletWidget.getContentWidget());
    if ((incomingPortletCandidate) == pc) {
        incomingPortletCandidate = null;
    }else
        if (getChildComponents().contains(pc)) {
            outcomingPortletCandidate = pc;
        }
    
}