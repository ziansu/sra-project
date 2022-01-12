private void addVisualConnection(UIControllers.MapViewController.Connection c) {
    if (!(connections.contains(c))) {
        connections.add(c);
        javafx.scene.shape.Line l = new javafx.scene.shape.Line();
        lines.put(c, l);
        addLineListeners(l, c);
        updateLineForConnection(c);
        mapViewPane.getChildren().add(1, l);
    }else {
        java.lang.System.out.println("True");
    }
}