private void setUrlFragment(java.lang.String urlFragment) {
    if (urlFragment == null)
        urlFragment = "";
    
    com.vaadin.server.Page page = cxf.sample.ui.UI.getCurrent().getPage();
    page.setUriFragment((((cxf.sample.ui.PersonsView.VIEW_NAME.toLowerCase()) + "/") + urlFragment), false);
}