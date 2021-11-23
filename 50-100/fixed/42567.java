public void validate(java.lang.Object target, org.springframework.validation.Errors errors) {
    com.atai.dental.module.enterp.model.Appointment form = ((com.atai.dental.module.enterp.model.Appointment) (target));
    java.util.Date appointmentDate = form.getAppointmentDate();
    java.lang.String appointmentTime = form.getAppointmentTime();
    java.lang.String doctorId = form.getDoctor();
    if (validateDoctor(errors, doctorId)) {
        validateApointmentDateAndTime(errors, form);
    }
}