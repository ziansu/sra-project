private java.lang.String findHalfHourAfter(int hours, int minutes) {
    java.lang.String halfHourAfter = "";
    minutes += 30;
    if (minutes > 60) {
        hours++;
        minutes -= 60;
    }
    halfHourAfter = formatTime(halfHourAfter, hours, minutes);
    return halfHourAfter += minutes;
}