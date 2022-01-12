@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    javax.swing.JFileChooser jfc = new javax.swing.JFileChooser();
    int result = jfc.showOpenDialog(view.getFrame());
    if (result == (javax.swing.JFileChooser.APPROVE_OPTION))
        model.loadPathbaseFile(jfc.getSelectedFile().getAbsolutePath());
    
    center.aggiorna();
}