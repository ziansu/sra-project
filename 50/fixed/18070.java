public void initEditCommandNameAndDeadline(int taskId, java.lang.String taskName, dooyit.parser.DateTime deadline) {
    editCommandType = EditCommandType.NAME_N_DEADLINE;
    this.taskName = taskName;
    this.dateTimeDeadline = deadline;
    this.taskId = taskId;
}