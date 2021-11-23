private void updatejComboBox_CHL_Host(DynamicTreeNode selectedBaseStation) {
    java.util.HashMap<java.lang.String, java.lang.Object> mobileHosts = selectedBaseStation.database;
    java.util.Iterator entries = mobileHosts.entrySet().iterator();
    jComboBox_CHL_Host.removeAllItems();
    while (entries.hasNext()) {
        java.util.Map.Entry thisEntry = ((java.util.Map.Entry) (entries.next()));
        jComboBox_CHL_Host.addItem(thisEntry.getKey());
    } 
}