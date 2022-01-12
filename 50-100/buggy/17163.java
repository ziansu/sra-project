public void importNew(final javafx.event.ActionEvent e) {
    java.lang.System.out.println("importing");
    final javafx.stage.FileChooser fileExplorer = new javafx.stage.FileChooser();
    fileExplorer.getExtensionFilters().addAll(new javafx.stage.FileChooser.ExtensionFilter("gfa files", "*.gfa"));
    java.io.File file = fileExplorer.showOpenDialog(verticalBox.getScene().getWindow());
    if (file != null) {
        gui.toolbar.ImportGfa importer = new gui.toolbar.ImportGfa(Launcher.stage, file.getAbsolutePath(), file.getName(), verticalBox);
        importer.startImport();
    }
}