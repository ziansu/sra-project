private void updateUiVoltage(android.content.Intent intent) {
    double voltage = intent.getDoubleExtra(ConnectionManager.EXTRA_SERIAL_PORT_READ_BATTERY, (-1.0));
    android.widget.TextView tv = ((android.widget.TextView) (findViewById(R.id.battery_voltage)));
    if (tv != null) {
        tv.setText(java.lang.String.format(getString(R.string.string_voltage), voltage));
        if (voltage <= (ch.hsr.zedcontrol.MainActivity.THRESHOLD_VOLTAGE)) {
            tv.setTextColor(Color.RED);
        }else {
            tv.setTextColor(getResources().getColor(android.R.color.primary_text_light));
        }
    }
}