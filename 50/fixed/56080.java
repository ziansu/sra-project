@java.lang.Override
protected void onStart() {
    if (!(com.idgi.event.ApplicationBus.hasListener(this))) {
        com.idgi.event.ApplicationBus.register(this);
    }
    super.onStart();
}