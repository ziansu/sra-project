public java.lang.String submit() {
    if (selectedTimesheet.getStatus().equals(TimesheetStatus.NOTSUBMITTED.toString())) {
        selectedTimesheet.calculateFlexAndOvertime();
        float flex = selectedTimesheet.getEmployee().getFlexTime();
        flex -= selectedTimesheet.getFlextime();
        selectedTimesheet.getEmployee().setFlexTime(((int) (flex)));
    }
    selectedTimesheet.setStatus(("" + (TimesheetStatus.WAITINGFORAPPROVAL.ordinal())));
    save();
    return null;
}