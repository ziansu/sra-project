@java.lang.Override
public int compare(seedu.ezdo.model.todo.Task taskOne, seedu.ezdo.model.todo.Task taskTwo) {
    java.lang.String taskOneStartDate = taskOne.getStartDate().toString();
    java.lang.String taskTwoStartDate = taskTwo.getStartDate().toString();
    int result = seedu.ezdo.commons.util.DateUtil.compareDateStrings(taskOneStartDate, taskTwoStartDate);
    return isSortedAscending ? result : -result;
}