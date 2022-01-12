private boolean testActiveClick(com.google.gwt.user.client.Event e) {
    com.google.gwt.dom.client.Element target = e.getEventTarget().cast();
    com.google.gwt.query.client.GQuery $e = com.google.gwt.query.client.GQuery.$(target);
    if (($e.parents(("#" + (containerId))).length()) > 0) {
        activeField = true;
    }else {
        closeField();
    }
    return true;
}