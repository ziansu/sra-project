@java.lang.Override
public int compareTo(java.lang.Object task) {
    model.Task comparedTask = ((model.Task) (task));
    int result = compareDueDate(comparedTask, this);
    if (result == 0) {
        result = compareStartDate(comparedTask, this);
    }
    if (result == 0) {
        result = comparedTask.getName().compareTo(this.getName());
    }
    return result;
}