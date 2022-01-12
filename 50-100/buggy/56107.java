private void setInfos(final javafx.scene.layout.Region content) {
    javafx.scene.layout.AnchorPane.setBottomAnchor(content, 0.0);
    javafx.scene.layout.AnchorPane.setLeftAnchor(content, 0.0);
    javafx.scene.layout.AnchorPane.setTopAnchor(content, 0.0);
    javafx.scene.layout.AnchorPane.setRightAnchor(content, 0.0);
    infosPane.getChildren().clear();
    infosPane.getChildren().add(content);
}