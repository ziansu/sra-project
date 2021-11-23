public boolean isEmpty() {
    if (taskGroupList.isEmpty()) {
        return true;
    }
    for (se.unlogic.standardutils.threads.SimpleExecutionController<T> controller : taskGroupList) {
        if (!(controller.getTaskQueue().isEmpty())) {
            return false;
        }
    }
    return true;
}