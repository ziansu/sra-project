private void initDateAndTime(main.java.Task.Type type, java.util.ArrayList<java.time.LocalDateTime> parsedDates) {
    switch (type) {
        case TIMED :
            date = parsedDates.get(main.java.Task.POSITION_FIRST_DATE).toLocalDate();
            startTime = parsedDates.get(main.java.Task.POSITION_FIRST_DATE).toLocalTime();
            endTime = parsedDates.get(main.java.Task.POSITION_SECOND_DATE).toLocalTime();
            break;
        case DEADLINE :
            date = parsedDates.get(main.java.Task.POSITION_FIRST_DATE).toLocalDate();
            break;
        default :
            break;
    }
}