public void setModel(com.cburch.draw.model.CanvasModel value, com.cburch.draw.canvas.ActionDispatcher dispatcher) {
    com.cburch.draw.model.CanvasModel oldValue = model;
    if (oldValue != null) {
        if (!(oldValue.equals(value))) {
            oldValue.removeCanvasModelListener(listener);
        }
    }
    model = value;
    this.dispatcher = dispatcher;
    if (value != null) {
        value.addCanvasModelListener(listener);
    }
    selection.clearSelected();
    repaint();
    firePropertyChange(com.cburch.draw.canvas.Canvas.MODEL_PROPERTY, oldValue, value);
}