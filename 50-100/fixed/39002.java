public void affecterSoutenances() {
    this.app.util_MySQL.set_db_field("CALL `affectationSoutenance`()");
    this.app.refreshContents();
    javax.swing.JOptionPane.showMessageDialog(this, "L'affectation est complete...", "Information", javax.swing.JOptionPane.INFORMATION_MESSAGE, new javax.swing.ImageIcon(getClass().getResource("/pts2soutenancemanager/Interface/ui/button/ui_info.png")));
}