private void initPaddingAfter() {
    paddingAfterField = new gui.styling.StyledTextfield("");
    paddingAfterField.setAlignment(javafx.geometry.Pos.CENTER);
    paddingAfterBox = new javafx.scene.layout.HBox(gui.misc.TweakingHelper.GENERAL_SPACING);
    javafx.scene.control.Label paddingAfterLabel = new javafx.scene.control.Label("Padding after:");
    paddingAfterBox.getChildren().addAll(paddingAfterLabel, paddingBeforeField);
    paddingAfterBox.setAlignment(javafx.geometry.Pos.CENTER);
    this.getChildren().add(paddingAfterBox);
}