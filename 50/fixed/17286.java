@java.lang.Override
public void showSetHaverError() {
    if (isAdded()) {
        showMessage(getString(R.string.setting_haver_error));
    }
}