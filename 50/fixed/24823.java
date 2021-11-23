private void OnOddEvenWeekChecked(boolean isOdd) {
    updateCurrentDayReference();
    android.app.Fragment f = getFragmentManager().findFragmentById(R.id.mainFragment);
    if (f instanceof com.SFEDU.schedule_1.ScheduleEditRecordFragment) {
        return ;
    }
    showDayWeek(mCurrentDay);
}