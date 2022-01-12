private void updatejComboBox_CHL_Host(DynamicTreeNode selectedBaseStation) {
    java.util.HashMap<java.lang.String, java.lang.Object> mobileHosts = selectedBaseStation.database;
    java.util.Iterator entries = mobileHosts.entrySet().iterator();
    jComboBox_CHL_Host.removeAllItems();
    while (entries.hasNext()) {
        java.util.Map.Entry thisEntry = ((java.util.Map.Entry) (entries.next()));
        if (thisEntry.getValue().equals(selectedBaseStation)) {
            jComboBox_CHL_Host.addItem(thisEntry.getKey());
        }
    } 
}