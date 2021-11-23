private void addTimeToBox(java.lang.String t) {
    javax.swing.DefaultComboBoxModel<java.lang.String> model = ((javax.swing.DefaultComboBoxModel<java.lang.String>) (timeBox.getModel()));
    for (int i = 0; i < (model.getSize()); i++) {
        if (model.getElementAt(i).equals(t)) {
            model.removeElementAt(i);
            break;
        }
    }
    model.insertElementAt(t, 1);
    timeBox.setSelectedIndex(1);
}