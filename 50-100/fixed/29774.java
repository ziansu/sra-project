public javax.swing.JList listPanel(javax.swing.DefaultListModel<java.lang.String> listModel) {
    javax.swing.JList countryList = new javax.swing.JList<>(listModel);
    countryList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
    countryList.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
    countryList.setVisibleRowCount((-1));
    return countryList;
}