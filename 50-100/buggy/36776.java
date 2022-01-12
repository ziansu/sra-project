public static void setComboSelection(javax.swing.JComboBox cb, java.lang.String sel) {
    java.awt.event.ActionListener[] listeners = cb.getActionListeners();
    for (int i = 0; i < (listeners.length); i++)
        cb.removeActionListener(listeners[i]);
    
    cb.setSelectedItem(sel);
    for (int i = 0; i < (listeners.length); i++)
        cb.addActionListener(listeners[i]);
    
}