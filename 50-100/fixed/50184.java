@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    switch (buttonView.getId()) {
        case R.id.night_mode :
            app.setNightMode(isChecked);
            break;
        case R.id.notify_mode :
            app.setNotifyMode(isChecked);
            break;
        case R.id.advertise_mode :
            if (isChecked == true) {
                displayWarning();
            }
            app.setAdMode(isChecked);
            break;
        default :
            break;
    }
}