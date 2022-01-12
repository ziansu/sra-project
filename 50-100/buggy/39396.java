@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    setting.setDailyTrafficLimitationAlarm(true);
    java.lang.Long value = com.zohaltech.app.sigma.classes.TrafficUnitsUtil.MbToByte(java.lang.Integer.valueOf(edtDailyLimitationAlarm.getText().toString()));
    setting.setDailyTrafficLimitation(value);
    com.zohaltech.app.sigma.dal.Settings.update(setting);
}