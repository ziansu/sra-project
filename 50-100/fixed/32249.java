@java.lang.Override
public int getJoinUserNumbersInSchedule(int scheduleId) {
    com.netease.yixing.model.TravelSchedule schedule = travelScheduleDao.getJoinUserNumbersInSchedule(scheduleId);
    int num = 0;
    if (schedule != null) {
        java.lang.String groupMemeberStr = schedule.getGroupMembers();
        if (groupMemeberStr != null) {
            java.lang.String[] groupMembers = groupMemeberStr.split(";;;");
            num = groupMembers.length;
        }
    }
    return num;
}