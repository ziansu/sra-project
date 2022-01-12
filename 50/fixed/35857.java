public static java.lang.String removeDateTime(java.lang.String command, java.lang.String dateTime) {
    return taskcommando.logic.CommandParser.removeFirstWord(taskcommando.logic.CommandParser.removeFirstWord(command), dateTime);
}