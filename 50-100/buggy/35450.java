private void setTestTime() {
    testTime = java.lang.System.currentTimeMillis();
    java.lang.String currentDateandTimeDay = new com.samknows.ui2.activity.FormattedValues().getDate(testTime, "dd/MM/yyyy");
    java.lang.String currentDateandTimeTime = new com.samknows.ui2.activity.FormattedValues().getDate(testTime, "HH:mm:ss");
    changeFadingTextViewValue(tv_Result_DateDay, currentDateandTimeDay, 0);
    changeFadingTextViewValue(tv_Result_DateTime, currentDateandTimeTime, 0);
}