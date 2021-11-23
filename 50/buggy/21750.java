public void createCalendar(org.apache.openmeetings.db.entity.calendar.OmCalendar calendar) {
    if ((calendar.getId()) != null) {
        calendarDao.update(calendar);
    }
    discoverCalendars(calendar);
}