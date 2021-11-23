public java.time.LocalTime determineHour(java.lang.String time) {
    if ((time.substring(0, time.indexOf(":")).length()) == 1) {
        time = organizer.logic.DateAndTime.singleDigitTimeDate.concat(time);
    }
    return java.time.LocalTime.parse(time);
}