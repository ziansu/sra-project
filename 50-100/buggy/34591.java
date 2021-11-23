public void processInitialization(java.lang.String[] inputs) {
    Task newTask;
    if (isInputsHavingTID(inputs)) {
        newTask = processInitializationWithID(inputs);
    }else {
        newTask = processInitializationWithoutID(inputs);
    }
    checkTaskDetails(newTask.clone());
    addIDToTaskIDs(newTask.getTID());
    sortTasks(tasks, TaskManager.DATE_FROM);
    tasks.add(newTask);
}