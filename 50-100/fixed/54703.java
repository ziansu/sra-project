private void init() {
    javax.swing.JTable table = getTable();
    final javax.swing.JPopupMenu popupMenu = new javax.swing.JPopupMenu();
    javax.swing.JMenuItem variabilizeItem = new javax.swing.JMenuItem(org.apache.jmeter.util.JMeterUtils.getResString("transform_into_variable"));
    variabilizeItem.addActionListener(new java.awt.event.ActionListener() {
        @java.lang.Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            transformNameIntoVariable();
        }
    });
    popupMenu.add(variabilizeItem);
    table.setComponentPopupMenu(popupMenu);
}