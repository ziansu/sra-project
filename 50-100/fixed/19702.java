public void copyItem(javax.swing.JPopupMenu popup) {
    javax.swing.JMenuItem edit = new javax.swing.JMenuItem("Copy");
    edit.addActionListener((java.awt.event.ActionEvent e) -> {
        _parent.getEditor().copyItem(_parent);
    });
    popup.add(edit);
}