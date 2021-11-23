public org.projectforge.business.teamcal.event.model.TeamEventDO addRecurrenceExDate(final java.util.Date date) {
    if (date == null) {
        return this;
    }
    final java.lang.String exDate;
    exDate = org.projectforge.framework.calendar.ICal4JUtils.asICalDateString(date, DateHelper.UTC, isAllDay());
    if (((recurrenceExDate) == null) || (recurrenceExDate.isEmpty())) {
        recurrenceExDate = exDate;
    }else
        if ((recurrenceExDate.contains(exDate)) == false) {
            recurrenceExDate = ((recurrenceExDate) + ",") + exDate;
        }
    
    return this;
}