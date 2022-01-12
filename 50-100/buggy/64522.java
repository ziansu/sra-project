@java.lang.Override
public void setDelay(int tag, long delay) {
    if (delay < 0) {
        delay = 0;
    }
    synchronized(mSchedulerMap) {
        com.heaven7.java.logic.AbstractLogicAction.Schedulers s = new com.heaven7.java.logic.AbstractLogicAction.Schedulers();
        s.delay = delay;
        mSchedulerMap.append(tag, s);
    }
}