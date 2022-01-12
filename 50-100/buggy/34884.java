public void mouseClicked(java.awt.event.MouseEvent e) {
    if ((e.getClickCount()) == 2) {
        int selectedIndex = userList.getSelectedIndex();
        if (selectedIndex >= 0) {
            javax.swing.DefaultListModel lm = ((javax.swing.DefaultListModel) (userList.getModel()));
            lm.removeElementAt(selectedIndex);
        }
    }
}