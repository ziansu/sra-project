public void initEditCommandDeadline(int taskId, dooyit.parser.DateTime deadline) {
    editCommandType = EditCommandType.DEADLINE;
    this.dateTimeDeadline = deadline;
    this.taskId = taskId;
}