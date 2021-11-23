@java.lang.Override
public void run() {
    saveSelectedTaskIndex();
    taskToBeExecuted = currentTaskList.get(getSelectedTaskIndex());
    commandToBeExecuted = new main.logic.DoneCommand(receiver, taskToBeExecuted);
    invoker.execute(commandToBeExecuted);
    main.ui.RootLayoutController.logger.log(java.util.logging.Level.INFO, ((("Pressed CTRL+D key: Task " + (getSelectedTaskIndex())) + 1) + " done"));
}