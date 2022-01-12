public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    javax.swing.ListSelectionModel sm = ((javax.swing.ListSelectionModel) (e.getSource()));
    if (!(sm.isSelectionEmpty())) {
        ccol = table.getSelectedColumn();
    }
    changeProgram(instrumentarray[crow][ccol]);
}