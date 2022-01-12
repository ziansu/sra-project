boolean addAppointment(fontys.time.Appointment apt) {
    boolean found = false;
    if (apt != null) {
        for (fontys.time.Appointment apt2 : appointments) {
            if (apt2.equals(apt)) {
                found = true;
            }
        }
        if (!found) {
            appointments.add(apt);
        }
    }
    return false;
}