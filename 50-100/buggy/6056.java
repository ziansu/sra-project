@java.lang.Override
@org.springframework.transaction.annotation.Transactional
public java.util.List<java.lang.String> getAttendeeNamesViaEventId(int eventId) {
    java.lang.System.out.println("line 80 reached");
    java.util.List<calendar.model.Attendance> attendance = attendanceDAO.selectAttendancesByEventId(eventId);
    java.lang.System.out.println("line 82 reached");
    java.util.List<java.lang.String> nameList = new java.util.ArrayList<java.lang.String>();
    for (calendar.model.Attendance a : attendance) {
        calendar.model.Account account = accountService.selectAccountById(a.getAccountId());
        java.lang.System.out.println("line 88 reached");
        nameList.add(account.getAccountName());
    }
    return nameList;
}