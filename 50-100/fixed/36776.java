public static void setComboSelection(javax.swing.JComboBox cb, java.lang.String sel) {
    java.awt.event.ActionListener[] listeners = cb.getActionListeners();
    for (java.awt.event.ActionListener listener : listeners) {
        cb.removeActionListener(listener);
    }
    cb.setSelectedItem(sel);
    for (java.awt.event.ActionListener listener : listeners) {
        cb.addActionListener(listener);
    }
}