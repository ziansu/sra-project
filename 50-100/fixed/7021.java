public static java.util.ArrayList<dhbw.timetable.data.Appointment> GetAppointmentsOfDay(java.util.GregorianCalendar day, java.util.ArrayList<dhbw.timetable.data.Appointment> list) {
    java.util.ArrayList<dhbw.timetable.data.Appointment> dayAppointments = new java.util.ArrayList<>();
    if (list == null)
        return dayAppointments;
    
    java.lang.String currDate = new java.text.SimpleDateFormat("dd.MM.yyyy", java.util.Locale.GERMANY).format(day.getTime());
    for (dhbw.timetable.data.Appointment a : list) {
        if (a.getDate().equals(currDate)) {
            dayAppointments.add(a);
        }
    }
    return dayAppointments;
}