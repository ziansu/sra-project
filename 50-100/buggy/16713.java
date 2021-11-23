public boolean undoToDoList() {
    if (toDoListChanges.isEmpty()) {
        return false;
    }
    seedu.commando.model.ToDoListChange change = toDoListChanges.get(((toDoListChanges.size()) - 1));
    try {
        applyToDoListChange(change.getReverseChange());
    } catch (seedu.commando.commons.exceptions.IllegalValueException exception) {
        assert false;
        return false;
    }
    toDoListUndoChanges.add(change);
    toDoListChanges.remove(((toDoListChanges.size()) - 1));
    return true;
}