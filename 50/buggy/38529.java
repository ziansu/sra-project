@java.lang.Override
public void execute() {
    if ((((canDeleteStartDate()) && (canDeleteStartTime())) && (canDeleteEndDate())) && (canDeleteEndTime())) {
        deleteTask();
    }else {
        deleteTaskField();
    }
}