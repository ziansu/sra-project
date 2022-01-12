private boolean eventTargetsStandardPopup(com.google.gwt.dom.client.NativeEvent event) {
    com.google.gwt.dom.client.EventTarget target = event.getEventTarget();
    if (com.google.gwt.dom.client.Element.is(target)) {
        return (standardsDropListValues.getElement().isOrHasChild(com.google.gwt.dom.client.Element.as(target))) || (btnStandardsBrowse.getElement().isOrHasChild(com.google.gwt.dom.client.Element.as(target)));
    }
    return false;
}