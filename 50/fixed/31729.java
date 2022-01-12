public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if ((-1) != (MsgUserList.getSelectedIndex())) {
        userToContact = MsgUsrListString.getElementAt(MsgUserList.getSelectedIndex()).toString();
    }
}