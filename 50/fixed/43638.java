private void addAlarm(com.github.xzwj87.todolist.schedule.ui.model.ScheduleModel item) {
    android.util.Log.d(com.github.xzwj87.todolist.alarm.service.AlarmObserver.LOG_TAG, ("addAlarm(): title = " + (item.getTitle())));
    mAlarmService.addAlarmSchedule(item);
    mAlarmService.setAlarm(item);
}