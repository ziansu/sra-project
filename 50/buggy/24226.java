public java.util.ArrayList<task.entity.Task> processCommand(java.lang.String userInput) {
    return logic.api.Executor.logicExecutor.parseCommand(userInput);
}