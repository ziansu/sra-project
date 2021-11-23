@java.lang.Override
public void handle(javafx.scene.input.MouseEvent e) {
    for (javafx.scene.Node node : grid.getChildren()) {
        if (node.getBoundsInParent().contains(e.getSceneX(), e.getSceneY())) {
            rectangleClicked(javafx.scene.layout.GridPane.getColumnIndex(node), javafx.scene.layout.GridPane.getRowIndex(node));
        }
    }
}