private void updateAppointment(org.apache.openmeetings.db.entity.calendar.Appointment a) {
    org.apache.openmeetings.service.calendar.caldav.AppointmentManager appointmentManager = calendarPanel.getAppointmentManager();
    appointmentManager.updateItem(a);
    appointment = null;
}