public void setButtonMotion(int[] array) {
    buttonMotion = new javafx.scene.control.Button("Motion");
    buttonMotion.setStyle("-fx-background-color: #00c9ff;");
    buttonMotion.setOnAction(( event) -> {
        javafx.animation.SequentialTransition transition = new javafx.animation.SequentialTransition();
        transition = mergeSortAllElements(array, arrayCells, transition);
        buttonMotion.setDisable(true);
        transition.play();
        transition.setOnFinished(( event1) -> buttonStepByStep.setDisable(false));
        buttonMotion.setDisable(false);
    });
}