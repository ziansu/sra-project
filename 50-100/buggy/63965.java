public void computeFullName(com.axelor.apps.hr.db.TimesheetLine timesheetLine) {
    try {
        timesheetLine.setFullName((((((timesheetLine.getAffectedToTimeSheet().getFullName()) + " ") + (timesheetLine.getDate())) + " ") + (timesheetLine.getId())));
    } catch (java.lang.Exception e) {
        throw new javax.persistence.PersistenceException(e.getLocalizedMessage());
    }
}