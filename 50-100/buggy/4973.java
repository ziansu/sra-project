private int checkIfOverdue(application.storage.Task item, java.util.Calendar cal) {
    int overdueCheck = application.gui.CalendarViewPage.overdueCheckVariable;
    if ((item.getEndDate()) != null) {
        overdueCheck = item.getEndDate().getTime().compareTo(cal.getTime());
    }
    return overdueCheck;
}