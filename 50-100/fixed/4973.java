private int checkIfOverdue(application.storage.Task item, java.util.Calendar cal) {
    int overdueCheck = application.gui.CalendarViewPage.overdueCheckVariable;
    assert (item.getEndDate()) != null;
    if ((item.getEndDate()) != null) {
        overdueCheck = item.getEndDate().getTime().compareTo(cal.getTime());
    }
    return overdueCheck;
}