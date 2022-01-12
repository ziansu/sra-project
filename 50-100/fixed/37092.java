public void saveAsButton(javafx.event.ActionEvent event) {
    javafx.stage.FileChooser fc = GUI.Main.Utils.fileWindow("Salvar imagem");
    java.io.File file = fc.showSaveDialog(null);
    if (file != null) {
        java.lang.String extension = GUI.Main.Utils.fileExtension(file);
        try {
            javax.imageio.ImageIO.write(javafx.embed.swing.SwingFXUtils.fromFXImage(GUI.Main.MainController.current.getImage(), null), extension, file);
        } catch (java.io.IOException ex) {
            java.lang.System.out.println(ex.getMessage());
        }
    }
}