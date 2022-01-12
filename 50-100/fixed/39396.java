@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    java.lang.Long value = 0L;
    if ((edtDailyLimitationAlarm.getText().length()) != 0) {
        value = com.zohaltech.app.sigma.classes.TrafficUnitsUtil.MbToByte(java.lang.Integer.valueOf(edtDailyLimitationAlarm.getText().toString()));
    }
    setting.setDailyTrafficLimitationAlarm(true);
    setting.setDailyTrafficLimitation(value);
    com.zohaltech.app.sigma.dal.Settings.update(setting);
}