private void resetColors() {
    for (gui.NamedCircle n : nodes) {
        n.setFill(javafx.scene.paint.Color.BLACK);
        n.getNameTag().setTextFill(javafx.scene.paint.Color.WHITE);
    }
    for (gui.DirectedEdge e : edges) {
        if (e.hasArc()) {
            e.getArc().setStroke(javafx.scene.paint.Color.BLACK);
        }else
            if (e.hasLine()) {
                e.getLine().setStroke(javafx.scene.paint.Color.BLACK);
            }
        
        e.getTriangle().setFill(javafx.scene.paint.Color.BLACK);
    }
}