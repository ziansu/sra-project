public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser fileChooser = new javax.swing.JFileChooser();
    int opt = fileChooser.showDialog(null, "Importieren");
    if (opt == (javax.swing.JFileChooser.APPROVE_OPTION)) {
        java.io.File file = fileChooser.getSelectedFile();
        this.course.addDocument(file);
        updateList();
    }
}