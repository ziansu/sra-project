public void updateFromBundle(android.os.Bundle bundle) {
    switch (bundle.getInt("Activity Key")) {
        case 1 :
            callAlarmFragment();
            break;
        case 2 :
            callReminderFragment();
            break;
        case 3 :
            callGeofenceFragment();
            break;
        case 4 :
            callContactUsFragment();
            break;
    }
}