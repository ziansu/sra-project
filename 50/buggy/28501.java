public java.util.List<com.liferay.timesheet.model.TimeEntry> findByTimesheet(final long timesheetId) {
    return timeEntryPersistence.findByTimesheet(userId);
}