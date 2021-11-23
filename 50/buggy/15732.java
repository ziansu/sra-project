@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(getLayout());
    initializeNameableList();
    com.idgi.event.ApplicationBus.register(this);
    super.initializeWithTitle(getTitleName());
}