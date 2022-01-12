public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if ((dlg.showSaveDialog(this)) != (javax.swing.JFileChooser.APPROVE_OPTION))
        return ;
    
    java.lang.String fileName = (dlg.getSelectedFile().getAbsolutePath()) + ".html";
    java.lang.String shortName = (dlg.getSelectedFile().getName()) + ".html";
    saveReport(fileName, shortName);
}