private void loadMenuItemAction() {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser(com.tkomiya.main.MainController.DEFAULT_SAVE_DIRECTORY);
    fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Text files", com.tkomiya.main.MainController.TEXT_FILE_EXTENSION));
    int val = fileChooser.showOpenDialog(mainView);
    if (val == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fileChooser.getSelectedFile();
        try {
            com.tkomiya.models.VocabList newVocabList = loadVocabListFromTextFile(file);
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }
}