private static void registerFeedbackButton(project6.MastermindFX.RoundButton button) {
    button.setOnAction(new javafx.event.EventHandler<javafx.event.ActionEvent>() {
        public void handle(javafx.event.ActionEvent event) {
            button.pegInput = project6.PegCreator.pegConstructor(project6.MastermindFX.cursorColor);
            button.redraw();
            project6.MastermindFX.cursorColor = "Gray";
            project6.MastermindFX.aiDecoderScene.setCursor(javafx.scene.Cursor.DEFAULT);
        }
    });
}