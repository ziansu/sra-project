@java.lang.Override
public main.logic.command.CommandResult execute() {
    try {
        model.doneTask(taskIndex);
        return new main.logic.command.CommandResult(java.lang.String.format(main.logic.command.DoneCommand.MESSAGE_SUCCESS, ((taskIndex) + 1)));
    } catch (java.lang.IndexOutOfBoundsException ie) {
        return new main.logic.command.CommandResult("The task index provided is invalid");
    } catch (main.model.task.UniqueTaskList.TaskNotFoundException pnfe) {
        return new main.logic.command.CommandResult("Task does not exist in task-tracker");
    }
}