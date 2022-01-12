private void getDBToLoadOnStartup() {
    javax.swing.JFileChooser fc = new javax.swing.JFileChooser();
    fc.setDialogTitle(com._17od.upm.util.Translator.translate("dbToOpenOnStartup"));
    int returnVal = fc.showOpenDialog(this);
    if (returnVal == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File databaseFile = fc.getSelectedFile();
        dbToLoadOnStartup.setText(databaseFile.getAbsoluteFile().toString());
    }
}