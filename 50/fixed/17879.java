@java.lang.Override
public void onRefresh() {
    java.lang.String compare1 = com.wieland.www.scheduletest.schedule.Schedule.getUpdateDate(this);
    com.wieland.www.scheduletest.activities.MainActivity.Refresh refresh = new com.wieland.www.scheduletest.activities.MainActivity.Refresh(this, compare1);
    refresh.execute();
}