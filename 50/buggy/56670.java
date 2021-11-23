public void onMouseMove(com.google.gwt.event.dom.client.MouseMoveEvent event) {
    com.google.gwt.event.logical.shared.ValueChangeEvent.fireIfNotEqual(this, valueOnDragStart, getValue());
    event.stopPropagation();
}