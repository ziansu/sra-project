public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        if ((userList.getSelectedIndex()) >= 0) {
            javax.swing.DefaultListModel lm = ((javax.swing.DefaultListModel) (userList.getModel()));
            lm.removeElementAt(userList.getSelectedIndex());
        }
    }
}