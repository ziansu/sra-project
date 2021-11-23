private void setYearOnAction(javafx.scene.layout.HBox box, java.time.LocalDateTime start, java.time.LocalDateTime end) {
    box.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            if ((event.getButton()) == (javafx.scene.input.MouseButton.PRIMARY)) {
                createMonthView(start, end);
            }
        }
    });
}