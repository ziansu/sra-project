public boolean saveFileDialog() {
    switch (this.jfImportFile.showSaveDialog(this)) {
        case javax.swing.JFileChooser.APPROVE_OPTION :
            fileExportPath = jfImportFile.getSelectedFile().toString();
            break;
        case javax.swing.JFileChooser.CANCEL_OPTION :
            fileExportPath = null;
            break;
        case javax.swing.JFileChooser.ERROR_OPTION :
            javax.swing.JOptionPane.showMessageDialog(this, translationArrayList.getTranslatedText("Fehler beim exportieren der Karten", Language.Deutsch, this.language));
            break;
    }
    if ((fileExportPath) != null)
        return true;
    else
        return false;
    
}