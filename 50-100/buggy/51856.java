public static Data.Appointment[] parseAppointments(java.lang.String raw) {
    java.lang.String[] line = raw.split("\\n");
    Data.Appointment[] result = new Data.Appointment[line.length];
    for (int i = 0; i < (line.length); i++) {
        result[i] = new Data.Appointment(line[i]);
    }
    return result;
}