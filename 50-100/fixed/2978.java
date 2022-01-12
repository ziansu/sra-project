public static javafx.scene.Node getNodeByRowColumnIndex(final int row, final int column, javafx.scene.layout.GridPane gridPane) {
    javafx.scene.Node result = null;
    javafx.collections.ObservableList<javafx.scene.Node> childrens = gridPane.getChildren();
    for (javafx.scene.Node node : childrens) {
        if (((javafx.scene.layout.GridPane.getRowIndex(node)) == row) && ((javafx.scene.layout.GridPane.getColumnIndex(node)) == column)) {
            result = node;
            break;
        }
    }
    return result;
}