private org.programirame.models.Event setupSubjectWithWholeDayEvent(boolean busy, java.lang.String wholeDayEventDate) {
    org.programirame.models.WholeDayEvent wholeDayEvent = new org.programirame.models.WholeDayEvent();
    org.programirame.services.DateTimeService dateTimeService = new org.programirame.services.DateTimeService();
    wholeDayEvent.setLocalDate(dateTimeService.getLocalDate(wholeDayEventDate, "yyyy-MM-dd"));
    wholeDayEvent.setBusy(busy);
    setup.subject.getWholeDayEvents().add(wholeDayEvent);
    return setup.getEvent(setup.dateFrom, setup.timeFrom, setup.dateTo, setup.timeTo);
}