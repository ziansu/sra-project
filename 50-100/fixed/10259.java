private int dateByWeekday(java.lang.String date, java.lang.String weekday) {
    boolean nextDate = false;
    int min;
    do {
        min = dateToMin(date, "00:00", nextDate);
        nextDate = true;
        while (!(bots.CalendarBot.CalDateFormat.minToWeekday(min, firstYear).equals(weekday))) {
            min++;
        } 
    } while (min < (bots.CalendarBot.CurrentDate.getDateInMin(firstYear)) );
    return min + (8 * 60);
}