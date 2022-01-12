@java.lang.Override
protected void onResume() {
    super.onResume();
    if (settings_activity_flag) {
        initializeSettings();
        if (thomas.jonathan.notey.MainActivity.spinnerChanged) {
            setUpSpinner();
            thomas.jonathan.notey.MainActivity.spinnerChanged = false;
        }
        settings_activity_flag = false;
    }
    if (about_activity_flag) {
        initializeSettings();
        if (thomas.jonathan.notey.MainActivity.justTurnedPro) {
            setUpMenu();
            setUpSpinner();
            thomas.jonathan.notey.MainActivity.justTurnedPro = false;
        }
        about_activity_flag = false;
    }
}