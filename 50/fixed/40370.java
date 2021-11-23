protected void onSelectionChanged() {
    org.brixcms.web.nodepage.PageParametersDropDownChoice.getRequestCycle().replaceAllRequestHandlers(getRequestHandler());
}