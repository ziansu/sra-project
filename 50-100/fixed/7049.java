@java.lang.Override
public boolean removeAppointment(java.lang.String emplid, java.lang.String id) {
    try {
        service = getCalendarService(emplid);
        if ((service) != null) {
            cosbas.appointment.Appointment event = appointmentRepository.findById(id);
            appointmentRepository.delete(event);
            service.events().delete("primary", event.getEventID()).setSendNotifications(true).execute();
            return true;
        }
    } catch (java.io.IOException e) {
        java.lang.System.out.println("COSBAS Calendar: In GoogleCalendarService could not initialize the service");
    }
    return false;
}