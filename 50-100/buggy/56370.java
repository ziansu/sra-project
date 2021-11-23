@java.lang.Override
public synchronized void updateInputWatermark(java.lang.Integer task, long taskInputWatermark) {
    com.google.common.base.Preconditions.checkState(initialized, "TimerService has not been initialized.");
    java.lang.Long oldTaskInputWatermark = upStreamTaskToInputWatermark.get(task);
    if (taskInputWatermark > oldTaskInputWatermark) {
        upStreamTaskToInputWatermark.put(task, taskInputWatermark);
        inputWatermarks.add(taskInputWatermark);
        inputWatermarks.remove(oldTaskInputWatermark);
        long newLocalInputWatermark = currentInputWatermark();
        if (newLocalInputWatermark > oldTaskInputWatermark) {
            fireTimers(newLocalInputWatermark);
        }
    }
}