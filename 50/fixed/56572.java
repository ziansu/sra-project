@java.lang.Override
public void openNewServerDialog() {
    data.ServerInfo newInfo = new data.ServerInfo();
    javax.swing.JDialog dialog = new view.SetupServerDialog(this, true, newInfo, this);
    dialog.setLocationRelativeTo(this);
    dialog.setVisible(true);
}