private int calculateAppointmentsindex(int index) {
    int appindex = -1;
    int nr = -1;
    for (GreenAppointment.Appointment a : GreenAppointment.DataManager.getAppointments()) {
        appindex++;
        nr++;
        int rep = a.getRepetisjon();
        nr += rep;
        if ((index >= (nr - rep)) && (index <= nr)) {
            return appindex;
        }
    }
    java.lang.System.out.println("Calculate appointments's index: NOT FOUND!");
    return -1;
}