public void fireLifeCycleEvent(com.shinemo.mpush.api.container.LifeCycle.LifeCyclePhase phase, java.lang.Object data) {
    if ((listeners.size()) > 0) {
        for (com.shinemo.mpush.api.container.LifeCycleListener listener : listeners) {
            listener.lifeCycleEvent(new com.shinemo.mpush.api.container.LifeCycleEvent(this, phase, data));
        }
    }
}