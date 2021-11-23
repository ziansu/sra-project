private void addTimeToBox(java.lang.String t) {
    javax.swing.DefaultComboBoxModel model = ((javax.swing.DefaultComboBoxModel) (timeBox.getModel()));
    for (int i = 0; i < (model.getSize()); i++) {
        if (model.getElementAt(i).equals(t)) {
            model.removeElementAt(i);
            break;
        }
    }
    model.insertElementAt(t, 1);
    timeBox.setSelectedIndex(1);
}