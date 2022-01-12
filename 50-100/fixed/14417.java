@java.lang.Override
public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
    oldConfig = dataSnapshot.getValue(com.slothnull.android.medox.model.AbstractConfig.class);
    if ((oldConfig) != null) {
        if ((oldConfig.enabled) != null) {
            java.lang.String[] enabled = oldConfig.enabled.split(",");
            settingsEnable = enabled[0].equals("1");
        }
    }
    hideProgressDialog();
}