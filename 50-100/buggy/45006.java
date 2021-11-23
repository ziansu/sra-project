public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    javax.swing.ListSelectionModel sm = ((javax.swing.ListSelectionModel) (e.getSource()));
    if (!(sm.isSelectionEmpty())) {
        java.lang.System.out.println(("colnum: " + (table.getSelectedColumn())));
        ccol = table.getSelectedColumn();
    }
    changeProgram(instrumentarray[crow][ccol]);
}