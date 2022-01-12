public java.util.ArrayList<logic.Task> addTask(java.lang.String description) {
    logic.Task newTask = new logic.Task(description);
    dictionary.add(description);
    if (!(logic.Execution.mainList.isEmpty())) {
        saveMainListForUndo();
    }
    logic.Execution.mainList.add(newTask);
    storage.setMainList(logic.Execution.mainList);
    try {
        storage.appendToFile(newTask);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return logic.Execution.mainList;
}