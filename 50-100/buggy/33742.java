private void addFunction() {
    java.lang.System.out.println(("In add, index = " + (index)));
    java.lang.System.out.println(("In add, lastSearchedIndex = " + (lastSearchedIndex)));
    logic.add.Add add = new logic.add.Add(taskObj, index, lastSearchedIndex, taskList);
    setOutput(add.run());
    setLastOutputTaskList(taskList);
    if (isUndoAction) {
        addToList(commandObj, redoList);
    }else {
        addToList(commandObj, undoList);
    }
}