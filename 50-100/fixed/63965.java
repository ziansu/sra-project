public void computeFullName(com.axelor.apps.hr.db.TimesheetLine timesheetLine) {
    timesheetLine.setFullName((((((timesheetLine.getAffectedToTimeSheet().getFullName()) + " ") + (timesheetLine.getDate())) + " ") + (timesheetLine.getId())));
}