private void initRadioButtonsState() {
    java.lang.String currentAcceptedConnectivity = com.example.blanche.projetfinal.DatabaseManager.getPreferencesManager().getNetworkConnectivity();
    if (currentAcceptedConnectivity == null) {
        com.example.blanche.projetfinal.DatabaseManager.getPreferencesManager().updateNetworkConnectivity("any");
        currentAcceptedConnectivity = "any";
    }
    if (currentAcceptedConnectivity.equals("wifi")) {
        wifiRadioButton.setChecked(true);
        anyNetworkRadioButton.setChecked(false);
    }else
        if (currentAcceptedConnectivity.equals("any")) {
            anyNetworkRadioButton.setChecked(true);
            wifiRadioButton.setChecked(false);
        }
    
}