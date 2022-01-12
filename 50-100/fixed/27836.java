public void editCalendar() {
    updateCalendarController();
    resourceCalendarModel.initEdit(workerModel.getCalendar());
    try {
        baseCalendarEditionController.doAfterCompose(editCalendarWindow);
    } catch (java.lang.Exception e) {
        throw new java.lang.RuntimeException(e);
    }
    baseCalendarEditionController.setSelectedDay(new org.joda.time.LocalDate());
    org.libreplan.web.common.Util.reloadBindings(editCalendarWindow);
    org.libreplan.web.common.Util.reloadBindings(createNewVersionWindow);
}