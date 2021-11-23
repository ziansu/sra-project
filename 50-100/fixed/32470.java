public static ScheduleHacks.Task editExistingTask(ScheduleHacks.Task oldTask, java.lang.String editStatement) {
    ScheduleHacks.Task newTask = new ScheduleHacks.Task();
    if (Parser.CommandParser.requiresDeletingParameters(editStatement)) {
        editStatement = Parser.CommandParser.removeFirstWord(editStatement);
        Parser.CommandParser.deleteParameters(oldTask, Parser.CommandParser.getParameterList(editStatement));
    }else {
        oldTask = Parser.CommandParser.setEditParameters(editStatement, oldTask);
    }
    newTask = oldTask;
    return newTask;
}