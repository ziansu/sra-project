public void initComboTitles() {
    javax.swing.DefaultComboBoxModel<de.tmasser.responsetemplates.MultiLingualEntry> comboBoxModel = new javax.swing.DefaultComboBoxModel<>();
    this.comboTitles.setModel(comboBoxModel);
    for (de.tmasser.responsetemplates.MultiLingualEntry entry : this.catalog.getAllEntries()) {
        comboBoxModel.addElement(entry);
    }
    this.comboTitles.setSelectedIndex(0);
    this.initComboLanguage();
}