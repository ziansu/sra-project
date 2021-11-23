@java.lang.Override
public void saveAsPreviousToDoListAndClearRedoHistory(seedu.onetwodo.model.ToDoList toDoList) {
    previousToDoLists.push(toDoList);
    nextToDoLists.clear();
}