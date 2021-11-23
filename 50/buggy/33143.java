@java.lang.Override
public void onDestroy() {
    eventBus.unregister(this);
    view = null;
}