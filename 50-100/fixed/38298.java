@java.lang.Override
protected void onResume() {
    super.onResume();
    if (settings_activity_flag) {
        initializeSettings();
        settings_activity_flag = false;
    }
    if (about_activity_flag) {
        initializeSettings();
        if (thomas.jonathan.notey.MainActivity.justTurnedPro) {
            setUpMenu();
            thomas.jonathan.notey.MainActivity.justTurnedPro = false;
        }
        about_activity_flag = false;
    }
}