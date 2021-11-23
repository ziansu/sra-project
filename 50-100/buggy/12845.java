@org.junit.Test
public void lookupAppointmentTest() throws java.text.ParseException {
    java.lang.String start = "2016-08-05T14:10:00Z";
    java.lang.String end = "2016-08-05T14:40:00Z";
    createAppointment(TESTDOC1, TESTPAT1, start, end);
    com.sergey.restclinic.resources.AppointmentResource a = new com.sergey.restclinic.resources.AppointmentResource();
    com.sergey.restclinic.models.Doctor doctor = com.sergey.restclinic.resources.AppointmentResource.lookupDoctor(TESTDOC1);
    com.sergey.restclinic.models.Patient patient = com.sergey.restclinic.resources.AppointmentResource.lookupPatient(TESTPAT1);
    java.util.List<com.sergey.restclinic.models.Appointment> apts = a.lookupAppointment(doctor, patient, start, end);
    org.junit.Assert.assertEquals(2, apts.size());
}