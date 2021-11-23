public void onClick(android.content.DialogInterface dialog, int item) {
    if (item == 0) {
        com.clic.org.serve.Utils.ClicUtils.createPreferences(this, sharedProfiles.getCustomerId(), R.string.clic_ClientID);
        com.clic.org.serve.Utils.ClicUtils.createPreferences(this, sharedProfiles.getCustomerId(), R.string.clic_SharedClientID);
    }else {
        com.clic.org.serve.Utils.ClicUtils.createPreferences(this, profiles.get((item - 1)).getSubcustomerId(), R.string.clic_ClientID);
        com.clic.org.serve.Utils.ClicUtils.createPreferences(this, sharedProfiles.getCustomerId(), R.string.clic_SharedClientID);
    }
    startHomeScreen();
}