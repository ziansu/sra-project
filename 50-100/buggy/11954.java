private void setMonthOnAction(javafx.scene.layout.HBox box, java.time.LocalDateTime start) {
    box.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            if ((event.getButton()) == (javafx.scene.input.MouseButton.PRIMARY)) {
                createDayView(start);
            }else
                if (((event.getButton()) == (javafx.scene.input.MouseButton.SECONDARY)) && (yearView)) {
                    createYear(timeline.getStart(), timeline.getEnd());
                }
            
        }
    });
}