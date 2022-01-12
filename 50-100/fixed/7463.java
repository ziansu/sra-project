public void onDragDropped(javafx.scene.input.DragEvent e) {
    javafx.scene.input.Dragboard db = e.getDragboard();
    catuml.shapes.Shapes shapes = ((catuml.shapes.Shapes) (db.getContent(javafx.scene.input.DataFormat.lookupMimeType("catuml/shapetype"))));
    double x = e.getX();
    double y = e.getY();
    putShape(shapes.newShape(), x, y);
    e.consume();
}