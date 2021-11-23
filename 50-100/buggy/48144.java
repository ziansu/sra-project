@javafx.fxml.FXML
public void onDragDropped(javafx.scene.input.DragEvent event) {
    javafx.scene.input.Dragboard db = event.getDragboard();
    boolean success = false;
    if (db.hasFiles()) {
        log.info("File dropped {}", db.getFiles());
        success = true;
    }
    event.setDropCompleted(success);
    event.consume();
    if (success) {
        convertFiles(db.getFiles());
    }
}