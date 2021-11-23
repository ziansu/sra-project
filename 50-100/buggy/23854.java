private void connect(com.edulectronics.tinycircuit.Models.Components.Component component, android.view.MotionEvent event) {
    com.edulectronics.tinycircuit.Models.Components.Connectors.Connector connector = new com.edulectronics.tinycircuit.Models.Components.Connectors.Connector();
    com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPointOrientation secondOrientation = getClickedArea(((int) (event.getX())));
    com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPoint firstConnectionPoint = getConnectionPoint(firstComponent, firstOrientation);
    com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPoint secondConnectionPoint = getConnectionPoint(component, secondOrientation);
    if (firstConnectionPoint != secondConnectionPoint) {
        connector.connect(getConnectionPoint(firstComponent, firstOrientation), getConnectionPoint(component, secondOrientation));
        connecting = false;
        redrawWires();
    }
}