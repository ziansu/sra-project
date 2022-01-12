@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser fastaChooser = new javax.swing.JFileChooser();
    fastaChooser.setFileFilter(Constants.FASTA_FILE_FILTER);
    fastaChooser.setMultiSelectionEnabled(false);
    fastaChooser.setDialogTitle("Choose the FASTA protein database you want to add");
    int returnVal = fastaChooser.showOpenDialog(owner);
    fastaChooser.setAcceptAllFileFilterUsed(false);
    if (returnVal == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        fastaFile = fastaChooser.getSelectedFile();
    }
    fileTextField.setText(fastaFile.getAbsolutePath().toString());
}