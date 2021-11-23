@java.lang.Override
public int compareTo(java.lang.Object task) {
    model.Task comparedTask = ((model.Task) (task));
    int result = compareDueDate(this, comparedTask);
    if (result == 0) {
        result = compareStartDate(this, comparedTask);
    }
    if (result == 0) {
        result = this.getName().compareTo(comparedTask.getName());
    }
    return result;
}