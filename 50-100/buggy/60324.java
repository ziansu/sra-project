public void addNewAppointment(jfxtras.scene.control.agenda.Agenda.AppointmentImplLocal newAppointment) {
    AppointmentEntity appointmentEntity = new AppointmentEntity();
    appointmentEntity.setStartTime(java.sql.Timestamp.valueOf(newAppointment.getStartLocalDateTime()));
    appointmentEntity.setEndTime(java.sql.Timestamp.valueOf(newAppointment.getEndLocalDateTime()));
    appointmentEntity.setDescription(newAppointment.getDescription());
    AppointmentModel.session.beginTransaction();
    AppointmentModel.session.save(appointmentEntity);
    AppointmentModel.session.getTransaction().commit();
}