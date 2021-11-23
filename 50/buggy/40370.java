@java.lang.Override
protected void onSelectionChanged(java.lang.Object newSelection) {
    org.brixcms.web.nodepage.PageParametersDropDownChoice.getRequestCycle().replaceAllRequestHandlers(getRequestHandler());
}