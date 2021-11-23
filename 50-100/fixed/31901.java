protected javax.swing.JMenuItem addToMenuWithShortcut(java.lang.String action, javax.swing.JMenu jm, int key, int modifier) {
    javax.swing.JMenuItem jmi = new javax.swing.JMenuItem(action);
    jmi.setActionCommand(action.toLowerCase());
    jmi.addActionListener(this);
    jmi.setAccelerator(javax.swing.KeyStroke.getKeyStroke(key, modifier));
    jm.add(jmi);
    return jmi;
}