@javafx.fxml.FXML
private void handleDoubleClick(javafx.scene.input.MouseEvent event) {
    if ((event.getClickCount()) == 2) {
        java.lang.String path = this.treeView.getSelectionModel().getSelectedItem().getValue();
        if ((path.split("\\.").length) != 0) {
            path = "data/" + path;
            java.lang.System.out.println(path);
            this.main.showFileOverview(path);
        }
    }
}