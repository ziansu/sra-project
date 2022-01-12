public static javafx.scene.Node getNodeByRowColumnIndex(final int row, final int column, javafx.scene.layout.GridPane gridPane) {
    javafx.scene.Node result = null;
    javafx.collections.ObservableList<javafx.scene.Node> childrens = gridPane.getChildren();
    for (javafx.scene.Node node : childrens) {
        if (((gridPane.getRowIndex(node)) == row) && ((gridPane.getColumnIndex(node)) == column)) {
            result = node;
            break;
        }
    }
    return result;
}