@java.lang.Override
public void start() {
    if (startFlag.compareAndSet(false, true)) {
        fireLifeCycleEvent(LifeCyclePhase.BEFORE_START);
        start0();
        fireLifeCycleEvent(LifeCyclePhase.AFTER_START);
    }else {
        com.shinemo.mpush.api.container.AbstractLifeCycle.log.error(("has start:" + (this.getClass().getSimpleName())));
    }
}