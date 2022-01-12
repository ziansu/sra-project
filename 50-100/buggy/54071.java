public boolean move(int originIndex, int destinationIndex) throws java.lang.Exception {
    if ((destinationIndex >= (getTasks().size())) || (destinationIndex < 1)) {
        throw new com.oracle.jrockit.jfr.InvalidValueException("Invalid Destination Index Value");
    }else {
        com.done.model.Done movedTask = getTasks().remove(originIndex);
        getTasks().add(destinationIndex, movedTask);
        updateTaskID();
    }
    if ((jsonStorage.store(getTasks())) == true) {
        return true;
    }
    return false;
}