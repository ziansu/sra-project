public void openFileDialog() {
    switch (this.jfImportFile.showOpenDialog(this)) {
        case javax.swing.JFileChooser.APPROVE_OPTION :
            fileImportPath = jfImportFile.getSelectedFile().toString();
            break;
        case javax.swing.JFileChooser.CANCEL_OPTION :
            break;
        case javax.swing.JFileChooser.ERROR_OPTION :
            javax.swing.JOptionPane.showMessageDialog(this, translationArrayList.getTranslatedText("Fehler beim importieren der Daten", Language.Deutsch, this.language));
            break;
    }
}