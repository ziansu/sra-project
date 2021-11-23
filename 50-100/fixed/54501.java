public void updateEventMemoryModelWithTime(int hourOfDay, int minuteOfDay) {
    com.david.todo.model.EventModel eventModel = getDateModelIntent();
    if (eventModel == null)
        throw new java.lang.IllegalStateException("Day must be selected before time can be set!");
    
    org.joda.time.DateTime date = new org.joda.time.DateTime(eventModel._date);
    date = date.withHourOfDay(0);
    date = date.withMinuteOfHour(0);
    date = date.plusHours(hourOfDay);
    date = date.plusMinutes(minuteOfDay);
    eventModel.setTime(date.toDate());
    _addItemActivity.setEventIntentKey(eventModel);
}