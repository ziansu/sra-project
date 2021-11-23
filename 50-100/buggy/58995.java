@java.lang.Override
public boolean CanDo(com.peace.auto.bl.Status status, java.lang.String userName) {
    if (status.canDo(Task.SHI_CHANG, userName)) {
        return status.canDo(Task.SHI_CHANG_CHECK, userName);
    }
    if ((status.todayFinishCount(Task.SHI_CHANG, userName)) == (Task.SHI_CHANG.getDayLimit(userName))) {
        status.Done(Task.SHI_CHANG_CHECK, com.peace.auto.bl.Status.nextDayCheck());
    }
    return false;
}