public void onRefreshed() {
    com.wieland.www.scheduletest.activities.MainActivity.Refresh refresh = new com.wieland.www.scheduletest.activities.MainActivity.Refresh(this, com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(this));
    refresh.execute();
}