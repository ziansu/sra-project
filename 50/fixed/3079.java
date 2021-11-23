public void onMouseUp(com.google.gwt.event.dom.client.MouseUpEvent event) {
    com.google.gwt.event.logical.shared.ValueChangeEvent.fireIfNotEqual(this, valueOnDragStart, getValue());
    valueOnDragStart = null;
}