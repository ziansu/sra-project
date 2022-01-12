boolean addAppointment(fontys.time.Appointment apt) {
    if (apt != null) {
        for (fontys.time.Appointment apt2 : appointments) {
            if (apt2.equals(apt)) {
                return false;
            }
        }
        appointments.add(apt);
        return true;
    }
    return false;
}