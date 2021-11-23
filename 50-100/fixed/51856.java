public static Data.Appointment[] parseAppointments(java.lang.String raw) {
    if (raw == null)
        return null;
    
    if ((raw.length()) == 0)
        return null;
    
    java.lang.String[] line = raw.split("\\n");
    Data.Appointment[] result = new Data.Appointment[line.length];
    for (int i = 0; i < (line.length); i++) {
        result[i] = new Data.Appointment(line[i]);
    }
    return result;
}