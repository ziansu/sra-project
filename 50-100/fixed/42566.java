@java.lang.Override
public int compare(seedu.ezdo.model.todo.Task taskOne, seedu.ezdo.model.todo.Task taskTwo) {
    java.lang.String taskOneStartDate = taskOne.getStartDate().toString();
    java.lang.String taskTwoStartDate = taskTwo.getStartDate().toString();
    return seedu.ezdo.commons.util.DateUtil.compareDateStrings(taskOneStartDate, taskTwoStartDate, isSortedAscending);
}