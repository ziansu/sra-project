public void onMouseMove(com.google.gwt.event.dom.client.MouseMoveEvent event) {
    if ((valueOnDragStart) != null) {
        com.google.gwt.event.logical.shared.ValueChangeEvent.fireIfNotEqual(this, valueOnDragStart, getValue());
    }
    event.stopPropagation();
}