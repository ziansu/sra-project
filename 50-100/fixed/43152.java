@java.lang.Override
public void onRequestSuccess(com.nolan.mmcs_schedule.repository.primitives.WeekType weekType) {
    currentWeek = weekType;
    com.nolan.mmcs_schedule.ui.schedule_activity.WeekTypeOption weekTypeOption = preferences.getWeekTypeOption();
    this.weekType = getWeekType(weekTypeOption);
    view.setSubtitle(getSubtitle(weekTypeOption));
    view.changeWeekType(this.weekType);
    getWeekTypeDone(pickedScheduleOfGroup, id, listener);
}