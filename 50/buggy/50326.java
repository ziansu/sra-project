@java.lang.Override
public void onCompleted() {
    mWeekView.notifyDatasetChanged();
    mWeekView.goToToday();
    mWeekView.goToHour(java.util.Calendar.getInstance(java.util.Locale.getDefault()).get(java.util.Calendar.HOUR_OF_DAY));
}