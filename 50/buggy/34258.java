void setAllActionListener() {
    setAllActionOfBoardToBlackOrWhite();
    New_Game.setOnMouseClicked(new javafx.event.EventHandler<javafx.scene.input.MouseEvent>() {
        @java.lang.Override
        public void handle(javafx.scene.input.MouseEvent event) {
            startAndInitial();
        }
    });
}