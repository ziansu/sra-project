protected void addToMenu(java.lang.String[] actions, javax.swing.JMenu jm) {
    for (java.lang.String s : actions) {
        javax.swing.JMenuItem jmi = new javax.swing.JMenuItem(s);
        jmi.setActionCommand(s.toLowerCase());
        jmi.addActionListener(this);
        jm.add(jmi);
    }
}