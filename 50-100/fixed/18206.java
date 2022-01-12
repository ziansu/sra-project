private void setNames(functionality.Bill bill) {
    functionality.NameList names = bill.getNames();
    javax.swing.JCheckBox[] nameLabels = new javax.swing.JCheckBox[]{ roommate1Label , roommate2Label , roommate3Label };
    int l = nameLabels.length;
    for (int i = 0; i < l; i++) {
        if (names.contains(nameLabels[i].getText())) {
            nameLabels[i].setSelected(true);
        }
    }
}