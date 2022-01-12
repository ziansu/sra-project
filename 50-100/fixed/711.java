void buttonStyling(javafx.scene.control.Button b) {
    b.setStyle("-fx-background-color: transparent;");
    b.setOnMouseEntered(( event) -> {
        b.setStyle("-fx-background-color: #CCCCCC");
    });
    b.setOnMouseExited(( event) -> {
        b.setStyle("-fx-background-color: transparent");
    });
}