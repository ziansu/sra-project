@java.lang.Override
public void onStop() {
    super.onStop();
    bus.unregister(this);
}