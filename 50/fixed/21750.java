public void createCalendar(org.apache.openmeetings.db.entity.calendar.OmCalendar calendar) {
    if ((calendar.getId()) == null)
        discoverCalendars(calendar);
    else
        calendarDao.update(calendar);
    
}