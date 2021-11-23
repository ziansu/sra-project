@java.lang.Override
public void start() {
    if (startFlag.compareAndSet(false, true)) {
        fireLifeCycleEvent(LifeCyclePhase.BEFORE_START, null);
        start0();
        fireLifeCycleEvent(LifeCyclePhase.AFTER_START, null);
    }else {
        com.shinemo.mpush.api.container.AbstractLifeCycle.log.error(("has start:" + (this.getClass().getSimpleName())));
    }
}