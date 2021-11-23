@org.junit.Test(expected = java.lang.IllegalArgumentException.class)
public void testaddAppointmentfalse() {
    c.addAppointment(null);
}