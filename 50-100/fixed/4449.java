@net.thucydides.core.annotations.Step
public void get_appointment_details_for(java.lang.String startTime, java.lang.String endTime, java.lang.String serviceName) {
    java.util.Optional<java.lang.String> opt = calendarPage.getAppointmentsDetailsFor(startTime, endTime, serviceName);
    softly.assertThat((!(opt.get().isEmpty())));
}