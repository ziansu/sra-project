private boolean comboBoxContains(javax.swing.JComboBox<java.lang.String> box, java.lang.String s) {
    for (int i = 0; i < (box.getItemCount()); i++) {
        if ((s != null) && (s.equals(roleRefinement.getItemAt(i)))) {
            return true;
        }
    }
    return false;
}