private void initPaddingBefore() {
    paddingBeforeField = new gui.styling.StyledTextfield("");
    paddingBeforeField.setAlignment(javafx.geometry.Pos.CENTER);
    paddingBeforeBox = new javafx.scene.layout.HBox(gui.misc.TweakingHelper.GENERAL_SPACING);
    javafx.scene.control.Label paddingBeforeLabel = new javafx.scene.control.Label("Padding before:");
    paddingBeforeBox.getChildren().addAll(paddingBeforeLabel, paddingBeforeField);
    paddingBeforeBox.setAlignment(javafx.geometry.Pos.CENTER);
    this.getChildren().add(paddingBeforeBox);
}