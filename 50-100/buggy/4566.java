public boolean redoToDoList() {
    if (toDoListUndoChanges.isEmpty()) {
        return false;
    }
    seedu.commando.model.ToDoListChange change = toDoListUndoChanges.get(((toDoListUndoChanges.size()) - 1));
    try {
        applyToDoListChange(change);
    } catch (seedu.commando.commons.exceptions.IllegalValueException exception) {
        assert false;
        return false;
    }
    toDoListChanges.add(change);
    toDoListUndoChanges.remove(((toDoListUndoChanges.size()) - 1));
    return true;
}