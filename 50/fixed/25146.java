private void setAppointmentStatus() {
    if ((selectedAppointment) != null) {
        if (selectedAppointment.isEditable()) {
            calendarView.setAppointmentStatus("Owned");
        }else {
            calendarView.setAppointmentStatus(selectedAppointment.getStatus());
        }
    }
}