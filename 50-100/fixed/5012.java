@javafx.fxml.FXML
public void clearShapes() {
    squareShape.setVisible(false);
    triangleShape.setVisible(false);
    airplane.setVisible(false);
    javafx.collections.ObservableList<javafx.scene.Node> nodes = anchorPane.getChildren();
    if ((nodes.size()) > 3)
        nodes.remove(3, nodes.size());
    
}