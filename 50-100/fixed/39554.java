private void fillTableHeaders(javafx.scene.control.TableView matrix, java.util.List<java.lang.String> columns) {
    matrix.getColumns().add(createColumn(0, ""));
    for (int i = 0; i < (columns.size()); i++) {
        matrix.getColumns().add(createColumn((i + 1), columns.get(i)));
    }
}