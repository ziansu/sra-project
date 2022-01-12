public boolean isEmpty() {
    if (this.taskGroupList.isEmpty()) {
        return true;
    }
    for (se.unlogic.standardutils.threads.SimpleExecutionController<T> controller : this.taskGroupList) {
        if (!(controller.getTaskQueue().isEmpty())) {
            return false;
        }
    }
    return true;
}