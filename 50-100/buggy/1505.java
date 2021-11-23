private void parseOn(java.lang.String userInput, org.jimple.planner.InputStruct inputStruct) throws java.lang.Exception {
    java.util.Calendar parsedCalendar = timeParser.parseTime(userInput);
    inputStruct.setAtIndex(INDEX_FROM, calendarToStringFormat(parsedCalendar));
    parsedCalendar.set(java.util.Calendar.HOUR_OF_DAY, 23);
    parsedCalendar.set(java.util.Calendar.MINUTE, 59);
    inputStruct.setAtIndex(INDEX_TO, calendarToStringFormat(parsedCalendar));
    java.lang.System.out.println((((inputStruct.getAtIndex(INDEX_FROM)) + " ") + (inputStruct.getAtIndex(INDEX_TO))));
}