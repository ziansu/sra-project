@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        notification.setChecked(true);
        notification_status.setText(getContext().getString(R.string.notification_on));
        editor.putString(com.greenfox.tribesoflagopusandroid.MainActivity.NOTIFICATION, "true");
        editor.apply();
    }else {
        notification.setChecked(true);
        notification_status.setText(getContext().getString(R.string.notification_off));
        editor.putString(com.greenfox.tribesoflagopusandroid.MainActivity.NOTIFICATION, "false");
        editor.apply();
    }
}