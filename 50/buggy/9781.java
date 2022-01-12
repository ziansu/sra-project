private void dispatchPropertyEvent(gr.entij.PropertyEvent e) {
    gr.entij.Entity.fireEvent(propertyListeners, e);
}