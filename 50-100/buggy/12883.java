private void backupAllMenuItemAction() {
    int response = mainView.showConfirmationDialog("Back up vocab files", "This will overwrite all previous backup files. Are you sure?");
    if (response == (javax.swing.JOptionPane.YES_OPTION)) {
        for (com.tkomiya.models.VocabList vlist : vocabLists) {
            java.io.File file = new java.io.File(((((com.tkomiya.main.MainController.DEFAULT_SAVE_DIRECTORY) + (vlist.getName())) + ".") + (com.tkomiya.main.MainController.BACKUP_FILE_EXTENSION)));
            saveVocabListAsTextFile(vlist, file);
        }
    }
}