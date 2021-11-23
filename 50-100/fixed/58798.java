private int checkIfOverdue(application.storage.Task item) {
    java.util.Calendar cal = java.util.Calendar.getInstance();
    int overdueCheck = application.gui.DateObject.NOT_OVERDUE_VARIABLE;
    assert (item.getEndDate()) != null;
    if ((item.getEndDate()) != null) {
        overdueCheck = item.getEndDate().getTime().compareTo(cal.getTime());
    }
    return overdueCheck;
}