@java.lang.Override
public void scheduleOn(int tag, @com.heaven7.java.base.anno.Nullable
com.heaven7.java.logic.Scheduler scheduler) {
    com.heaven7.java.logic.AbstractLogicAction.Schedulers s;
    synchronized(mSchedulerMap) {
        s = mSchedulerMap.get(tag);
        if (s == null) {
            s = new com.heaven7.java.logic.AbstractLogicAction.Schedulers();
            mSchedulerMap.append(tag, s);
        }
        s.schedulerOn = scheduler;
    }
}