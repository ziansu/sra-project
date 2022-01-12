@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    boolean supp = eventCtrl.delById(evtn.getId());
    if (supp) {
        javax.swing.JOptionPane bg = new javax.swing.JOptionPane();
        javax.swing.JOptionPane.showMessageDialog(null, "L evenement a ete supprime", "Supprimer evenement", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }else {
        javax.swing.JOptionPane bg = new javax.swing.JOptionPane();
        javax.swing.JOptionPane.showMessageDialog(null, "La suppression a echoué, verifier que les relations sont toutes supprimees", "Supprimer evenement", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}