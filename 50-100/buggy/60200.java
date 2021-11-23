public void saveFileDialog() {
    switch (this.jfImportFile.showSaveDialog(this)) {
        case javax.swing.JFileChooser.APPROVE_OPTION :
            fileExportPath = jfImportFile.getSelectedFile().toString();
            break;
        case javax.swing.JFileChooser.CANCEL_OPTION :
            javax.swing.JOptionPane.showMessageDialog(this, translationArrayList.getTranslatedText("Export wurde abgebrochen.", Language.Deutsch, this.language));
            break;
        case javax.swing.JFileChooser.ERROR_OPTION :
            javax.swing.JOptionPane.showMessageDialog(this, translationArrayList.getTranslatedText("Fehler beim exportieren der Karten", Language.Deutsch, this.language));
            break;
    }
}