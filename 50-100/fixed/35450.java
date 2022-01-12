private void setTestTime() {
    testTime = java.lang.System.currentTimeMillis();
    java.lang.String currentDateandTimeDay = new com.samknows.ui2.activity.FormattedValues().getDate(testTime, "dd/MM/yyyy");
    java.lang.String currentDateandTimeTime = new com.samknows.ui2.activity.FormattedValues().getDate(testTime, "HH:mm:ss");
    tv_Result_DateDay.setText(currentDateandTimeDay);
    tv_Result_DateTime.setText(currentDateandTimeTime);
}