private void connect(com.edulectronics.tinycircuit.Models.Components.Component component, android.view.MotionEvent event) {
    if (component != (firstComponent)) {
        com.edulectronics.tinycircuit.Models.Components.Connectors.Connector connector = new com.edulectronics.tinycircuit.Models.Components.Connectors.Connector();
        com.edulectronics.tinycircuit.Models.Components.Connectors.ConnectionPointOrientation secondOrientation = getClickedArea(((int) (event.getX())));
        connector.connect(getConnectionPoint(firstComponent, firstOrientation), getConnectionPoint(component, secondOrientation));
        connecting = false;
        redrawWires();
    }
}