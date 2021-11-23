public void valueChanged(javax.swing.event.ListSelectionEvent e) {
    if ((list_1.getSelectedValue()) != null) {
        btnUpdate_1.setEnabled(true);
    }
    if (((list_1.getSelectedValue()) == null) || (((schedulePD.Semester) (list_1.getSelectedValue())).isUsed())) {
        btnDelete_1.setEnabled(false);
    }else {
        btnDelete_1.setEnabled(true);
    }
}