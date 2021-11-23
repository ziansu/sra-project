public void onEditSwitchToggled(android.view.View view) {
    if (((android.widget.Switch) (view)).isChecked()) {
        editingDeviceInfo = true;
    }else {
        updateRSMDeviceValues();
        editingDeviceInfo = false;
    }
    android.view.inputmethod.InputMethodManager mgr = ((android.view.inputmethod.InputMethodManager) (getSystemService(Context.INPUT_METHOD_SERVICE)));
    mgr.hideSoftInputFromWindow(view.getWindowToken(), 0);
    updateDeviceInfoEditState();
}