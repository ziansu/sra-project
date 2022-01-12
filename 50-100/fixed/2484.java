@java.lang.Override
public void stop() {
    if (stopFlag.compareAndSet(false, true)) {
        fireLifeCycleEvent(LifeCyclePhase.BEFORE_STOP);
        stop0();
        fireLifeCycleEvent(LifeCyclePhase.AFTER_STOP);
    }else {
        com.shinemo.mpush.api.container.AbstractLifeCycle.log.error(("has stop:" + (this.getClass().getSimpleName())));
    }
}