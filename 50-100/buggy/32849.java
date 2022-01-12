public static void delMeeting(int roomIndex, int timeIndex) {
    if (meetingschedulingsystem.MeetingSchedulingSystem.rooms.isEmpty()) {
        java.lang.System.err.println("No rooms to delete meetings from.");
        return ;
    }
    meetingschedulingsystem.room delRoom = meetingschedulingsystem.MeetingSchedulingSystem.rooms.get(roomIndex);
    java.lang.System.out.printf("Room %d selected\n", delRoom.getNumber());
    meetingschedulingsystem.meeting[] meetings = delRoom.getMeetings();
    java.lang.System.out.printf(".delMeeting(meetings[%d])\n", timeIndex);
    delRoom.delMeeting(meetings[timeIndex]);
}