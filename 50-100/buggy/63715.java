public org.lunifera.ecview.servlet.mobile.IMobileUiParticipant findParticipant(com.vaadin.ui.UI ui, java.lang.String fragment) {
    if (fragment == null) {
        return null;
    }
    try {
        tracker = new org.osgi.util.tracker.ServiceTracker<org.lunifera.ecview.servlet.mobile.IMobileUiParticipant, org.lunifera.ecview.servlet.mobile.IMobileUiParticipant>(getContext(), createFilter(ui, fragment), null);
        return tracker.getService();
    } catch (org.osgi.framework.InvalidSyntaxException e) {
        org.lunifera.ecview.servlet.mobile.impl.MobileUI.LOGGER.error("{}", e);
    }
    return null;
}