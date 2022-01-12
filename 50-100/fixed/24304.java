public void lookupAppointmentTestExact() throws java.text.ParseException {
    java.lang.String start = INIT_DATE_START;
    java.lang.String end = INIT_DATE_END;
    createAppointment(TESTDOC1, TESTPAT1, start, end);
    com.sergey.restclinic.resources.AppointmentResource a = new com.sergey.restclinic.resources.AppointmentResource();
    com.sergey.restclinic.models.Doctor doctor = new com.sergey.restclinic.models.Doctor();
    com.sergey.restclinic.models.Patient patient = new com.sergey.restclinic.models.Patient();
}