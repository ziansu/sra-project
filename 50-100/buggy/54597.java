@java.lang.Override
public void scheduleOn(int tag, @com.heaven7.java.base.anno.Nullable
com.heaven7.java.logic.Scheduler scheduler) {
    if (scheduler == null) {
        synchronized(mSchedulerMap) {
            com.heaven7.java.logic.AbstractLogicAction.Schedulers s = mSchedulerMap.get(tag);
            if (s != null) {
                s.schedulerOn = null;
            }
        }
    }else {
        synchronized(mSchedulerMap) {
            com.heaven7.java.logic.AbstractLogicAction.Schedulers s = new com.heaven7.java.logic.AbstractLogicAction.Schedulers();
            s.schedulerOn = scheduler;
            mSchedulerMap.append(tag, s);
        }
    }
}