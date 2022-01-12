@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent actionEvent) {
    model.Appointment appointment = calendarView.getSelectedAppointment();
    if (appointment != null) {
        db.AppointmentDBC.removeInvitation(appointment.getId(), user.getUsername());
        if (appointment.isEditable()) {
            db.AppointmentDBC.removeAppointment(appointment.getId());
        }
    }
    dailyAppointmentList = db.AppointmentDBC.getAppointmentList(user.getUsername(), selectedDate);
    calendarView.setDailyAppointmentList(dailyAppointmentList);
}