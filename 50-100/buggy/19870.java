public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser pdfFc = new javax.swing.JFileChooser();
    pdfFc.setDialogTitle("Locate folder for PDF-outputfile");
    pdfFc.setAcceptAllFileFilterUsed(false);
    pdfFc.setFileSelectionMode(javax.swing.JFileChooser.DIRECTORIES_ONLY);
    if ((pdfFc.showOpenDialog(null)) == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        textPdfFile.setText(pdfFc.getSelectedFile().getPath());
        java.lang.String PdffilePath = textXslFile.getText();
        main.ConverterGUI.pdfNewString = PdffilePath.replace("\\", "\\\\");
    }
}