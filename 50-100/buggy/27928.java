protected org.rapla.components.calendarview.swing.ViewListener createListener() throws org.rapla.framework.RaplaException {
    org.rapla.plugin.abstractcalendar.RaplaCalendarViewListener listener = new org.rapla.plugin.abstractcalendar.RaplaCalendarViewListener(getClientFacade(), getI18n(), getRaplaLocale(), getLogger(), model, view.getComponent(), objectMenuFactories, menuFactory, calendarSelectionModel, clipboard, reservationController, infoFactory, raplaImages, dialogUiFactory, permissionController);
    listener.setKeepTime(true);
    return listener;
}