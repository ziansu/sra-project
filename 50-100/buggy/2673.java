@javafx.fxml.FXML
public void closeAction(javafx.event.ActionEvent event) {
    fadeOut();
    javafx.animation.Timeline timer = new javafx.animation.Timeline(new javafx.animation.KeyFrame(javafx.util.Duration.seconds(2), ( e) -> {
        javafx.scene.layout.StackPane parent = ((javafx.scene.layout.StackPane) (parentPane.getParent()));
        parent.getChildren().remove(parentPane);
    }));
    timer.play();
}