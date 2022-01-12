protected void onPreExecute() {
    super.onPreExecute();
    if (mSettings.getString(egor.shestopalov.com.studentapp.MainActivity.APP_PREFERENCES_LENGTH_OF_HALFPERIOD, "").equals(""))
        lengthOfHalfPeriod = 45;
    else
        lengthOfHalfPeriod = java.lang.Integer.parseInt(mSettings.getString(egor.shestopalov.com.studentapp.MainActivity.APP_PREFERENCES_LENGTH_OF_HALFPERIOD, ""));
    
    if (mSettings.getString(egor.shestopalov.com.studentapp.MainActivity.APP_PREFERENCES_LENGTH_OF_PERIOD_BREAK, "").equals(""))
        lengthOfPeriodBreak = 5;
    else
        lengthOfPeriodBreak = java.lang.Integer.parseInt(mSettings.getString(egor.shestopalov.com.studentapp.MainActivity.APP_PREFERENCES_LENGTH_OF_PERIOD_BREAK, ""));
    
}