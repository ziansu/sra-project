public void generateSaveUI() {
    javafx.stage.FileChooser fileChooser = new javafx.stage.FileChooser();
    fileChooser.setTitle("Export to SVG");
    fileChooser.setInitialDirectory(new java.io.File(java.lang.System.getProperty("user.home")));
    fileChooser.getExtensionFilters().add(new javafx.stage.FileChooser.ExtensionFilter("SVG Image", "*.svg"));
    java.io.File svgFile = fileChooser.showSaveDialog(null);
}