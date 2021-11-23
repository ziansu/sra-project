public void removeCursor() {
    javafx.scene.Node temp = application.VirtualCursor.getCurrentElement(application.VirtualCursor.gridPane);
    temp.setStyle("-fx-background-color: transparent");
    ((javafx.scene.control.Label) (temp)).setTextFill(javafx.scene.paint.Color.BLACK);
}