private void OnWeekDayChecked(int dayIndex, java.lang.String dayName) {
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainFragment);
    if (f instanceof com.SFEDU.schedule_1.ScheduleEditRecordFragment) {
        return ;
    }
    updateCurrentDayReference();
    showDayWeek(mCurrentDay);
}