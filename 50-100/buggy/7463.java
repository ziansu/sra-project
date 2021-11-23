public void onDragDropped(javafx.scene.input.DragEvent e) {
    javafx.scene.input.Dragboard db = e.getDragboard();
    catuml.shapes.Shapes shapes = ((catuml.shapes.Shapes) (db.getContent(javafx.scene.input.DataFormat.lookupMimeType("catuml/shapetype"))));
    putShape(shapes.newShape(), e.getX(), e.getY());
    e.consume();
}