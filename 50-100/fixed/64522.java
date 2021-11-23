@java.lang.Override
public void setDelay(int tag, long delay) {
    if (delay < 0) {
        delay = 0;
    }
    com.heaven7.java.logic.AbstractLogicAction.Schedulers s;
    synchronized(mSchedulerMap) {
        s = mSchedulerMap.get(tag);
        if (s == null) {
            s = new com.heaven7.java.logic.AbstractLogicAction.Schedulers();
            mSchedulerMap.append(tag, s);
        }
        s.delay = delay;
    }
}