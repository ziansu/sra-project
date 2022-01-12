@java.lang.Override
public int getJoinUserNumbersInSchedule(int scheduleId) {
    com.netease.yixing.model.TravelSchedule schedule = travelScheduleDao.getJoinUserNumbersInSchedule(scheduleId);
    java.lang.String groupMemeberStr = schedule.getGroupMembers();
    int num = 0;
    if (groupMemeberStr != null) {
        java.lang.String[] groupMembers = groupMemeberStr.split(";;;");
        num = groupMembers.length;
    }
    return num;
}