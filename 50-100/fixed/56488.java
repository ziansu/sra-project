@java.lang.Override
public void done() {
    int mType = javax.swing.JOptionPane.INFORMATION_MESSAGE;
    int result = javax.swing.JOptionPane.showConfirmDialog(this.f, "Create more world?", ((jProgressBar1.getValue()) + " World(s) Created"), javax.swing.JOptionPane.YES_NO_OPTION, mType);
    jProgressBar1.setValue(0);
    jTextField1.setEditable(true);
    jButton1.setEnabled(true);
    if (result == (javax.swing.JOptionPane.NO_OPTION))
        java.lang.System.exit(0);
    
}