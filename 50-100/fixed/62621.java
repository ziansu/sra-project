public void actionPerformed(java.awt.event.ActionEvent event) {
    cancelled = false;
    int n = javax.swing.JOptionPane.showConfirmDialog(net.sf.memoranda.ui.App.getFrame(), "this cannot be undone", net.sf.memoranda.util.Local.getString("Remove Template?"), javax.swing.JOptionPane.YES_NO_OPTION);
    if (n == (javax.swing.JOptionPane.YES_OPTION)) {
        remove = true;
        this.dispose();
    }else
        if (n == (javax.swing.JOptionPane.NO_OPTION)) {
            remove = false;
            cancelled = true;
        }
    
}