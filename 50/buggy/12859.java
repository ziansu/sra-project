@java.lang.Override
public void saveAsPreviousToDoListAndClearRedoHistory(seedu.onetwodo.model.ToDoList toDoList) {
    seedu.onetwodo.model.ToDoList copiedCurrentToDoList = new seedu.onetwodo.model.ToDoList(toDoList);
    previousToDoLists.push(copiedCurrentToDoList);
    nextToDoLists.clear();
}