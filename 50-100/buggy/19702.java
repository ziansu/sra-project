public void copyItem(javax.swing.JPopupMenu popup) {
    javax.swing.JMenuItem edit = new javax.swing.JMenuItem("Copy");
    edit.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent e) {
            _parent.getEditor().copyItem(_parent);
        }
    });
    popup.add(edit);
}