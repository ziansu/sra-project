private void insertNewDailyEvent() {
    if (isStart) {
        event = new com.hiwhitley.potatoandtomato.bean.DailyEvent();
        event.setName(titleText);
        event.setStartTime(com.hiwhitley.potatoandtomato.utils.CalendarUtils.getNowTime(com.hiwhitley.potatoandtomato.activity.TimerClockActivity.DATE_FORMAT));
        event.setEndTime("");
        event.setDuration(com.hiwhitley.potatoandtomato.utils.CalendarUtils.secToTime(circleTimerView.getCurrentTime()));
        android.util.Log.i(com.hiwhitley.potatoandtomato.activity.TimerClockActivity.TAG, event.toString());
        com.hiwhitley.potatoandtomato.db.DailyEventDbService.getInstance(getApplicationContext()).insertDailyEvent(event);
    }
}