void buttonStyling(javafx.scene.control.Button b) {
    b.setStyle("-fx-background-color: transparent;");
    b.setOnMouseEntered(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            b.setStyle("-fx-background-color: #CCCCCC");
        }
    });
    b.setOnMouseExited(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            b.setStyle("-fx-background-color: transparent");
        }
    });
}