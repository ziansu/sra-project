public com.aaspaasdoctor.entity.Calendar updateCalendar(com.aaspaasdoctor.entity.Calendar calendar) {
    if ((calendar != null) && ((calendar.getCalendarId()) != null)) {
        com.aaspaasdoctor.entity.Calendar tempCalendar = calendarRepository.findOne(calendar.getCalendarId());
        if (tempCalendar != null) {
            tempCalendar.setCalendarTitle(calendar.getCalendarTitle());
            tempCalendar.setStartDate(calendar.getStartDate());
            tempCalendar.setEndDate(calendar.getEndDate());
            return calendarRepository.save(tempCalendar);
        }
    }
    return new com.aaspaasdoctor.entity.Calendar();
}