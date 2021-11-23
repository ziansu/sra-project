private boolean setFormModelObject(org.apache.openmeetings.db.entity.calendar.Appointment a, org.apache.wicket.core.request.handler.IPartialPageRequestHandler target) {
    org.apache.openmeetings.db.entity.calendar.OmCalendar c = a.getCalendar();
    if (calendarPanel.getAppointmentManager().testConnection(c))
        return false;
    
    form.setModelObject(c);
    form.url.setModelObject(c.getHref());
    setButtons(target);
    return true;
}