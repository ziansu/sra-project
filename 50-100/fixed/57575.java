@java.lang.Override
public void undo() {
    main.logic.Edit.logger.log(java.util.logging.Level.INFO, "Command UNDO EDIT");
    taskList = main.logic.Edit.storage.getTaskList();
    java.util.ArrayList<main.resources.Task> displayList = main.logic.MainLogic.getDisplayList();
    taskList.remove(userInput.getTask());
    taskList.add(userInput.getTaskToEdit());
    if (!(displayList.equals(taskList))) {
        displayList.remove(userInput.getTask());
        displayList.add(userInput.getTaskToEdit());
    }
}