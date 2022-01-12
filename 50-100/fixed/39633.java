@java.lang.Override
public void execute() {
    if ((((canDeleteStartDate()) || (canDeleteStartTime())) || (canDeleteEndDate())) || (canDeleteEndTime())) {
        deleteTaskField();
    }else {
        deleteTask();
    }
}