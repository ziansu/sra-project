private void displayDays() {
    if ((days.size()) < 1) {
        tvDays.setText("Please select at least one day");
        return ;
    }
    java.lang.String dayCaption = "";
    for (int day : days) {
        dayCaption += (dayNames[day]) + ", ";
    }
    android.util.Log.d(com.technosales.mobitrack.AddScheduleActivity.TAG, dayCaption);
    dayCaption = dayCaption.substring(0, ((dayCaption.length()) - 2));
    tvDays.setText(dayCaption);
}