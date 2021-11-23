@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent e) {
    mainForm.getFriendSidePanel().resetPanel();
    mainForm.getFriendSidePanel().updateInfo(user, client);
    mainForm.getFriendSidePanel().getSearchTextField().setText("Search...");
}