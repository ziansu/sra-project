public static com.medtracker.Models.Record alarmToRecord(com.medtracker.Models.Alarm alarm, int dose) {
    int day = alarm.getDay();
    int hour = alarm.getHour();
    java.lang.String medicationKey = alarm.getMedication_key();
    int minute = alarm.getMinute();
    int month = alarm.getMonth();
    int year = alarm.getYear();
    return new com.medtracker.Models.Record(medicationKey, dose, 0, minute, hour, day, month, year);
}