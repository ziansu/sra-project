public java.nio.file.Path chooseFile(final java.lang.String title, final javafx.stage.FileChooser.ExtensionFilter... extensions) {
    de.vogel612.helper.ui.jfx.JFXDialog.fileChooser.setTitle(title);
    de.vogel612.helper.ui.jfx.JFXDialog.fileChooser.getExtensionFilters().clear();
    de.vogel612.helper.ui.jfx.JFXDialog.fileChooser.getExtensionFilters().addAll(extensions);
    return de.vogel612.helper.ui.jfx.JFXDialog.fileChooser.showOpenDialog(null).toPath();
}