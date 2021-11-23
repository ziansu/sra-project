private void setComboBoxModel(org.miradi.objecthelpers.DateUnit dateUnit) {
    java.lang.Object[] choiceItems = getChoiceItems(dateUnit);
    removeAllItems();
    setModel(new javax.swing.DefaultComboBoxModel(choiceItems));
}