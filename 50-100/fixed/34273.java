public java.lang.String submit() {
    if (selectedTimesheet.getStatus().equals(TimesheetStatus.NOTSUBMITTED.toString())) {
        selectedTimesheet.calculateFlexAndOvertime();
    }
    selectedTimesheet.setStatus(("" + (TimesheetStatus.WAITINGFORAPPROVAL.ordinal())));
    save();
    return null;
}