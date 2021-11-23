public void initEditCommandNameAndEvent(int taskId, java.lang.String taskName, dooyit.parser.DateTime start, dooyit.parser.DateTime end) {
    editCommandType = EditCommandType.NAME_N_EVENT;
    this.taskName = taskName;
    this.dateTimeStart = start;
    this.dateTimeEnd = end;
    this.taskId = taskId;
}