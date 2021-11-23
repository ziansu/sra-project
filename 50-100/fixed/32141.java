@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    super.onPostExecute(s);
    java.lang.String temp;
    java.lang.String pushDate;
    if (s != null) {
        java.lang.String[] t = s.split("\\|");
        temp = t[0];
        pushDate = t[1];
        com.kuahusg.weather.db.WeatherDB.saveTempAndDate(java.lang.Integer.valueOf(temp), pushDate);
        if (!(com.kuahusg.weather.util.Utility.isFromService)) {
            WeatherActivity.todayFrag.showTempAndDate(s);
        }
    }
}