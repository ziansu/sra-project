private void fillTableHeaders(javafx.scene.control.TableView matrix, java.util.List<java.lang.String> columns) {
    java.lang.System.out.println("fill headers called");
    matrix.getColumns().add(createColumn(0, ""));
    java.lang.System.out.println("add column");
    for (int i = 0; i < (columns.size()); i++) {
        matrix.getColumns().add(createColumn((i + 1), columns.get(i)));
    }
}