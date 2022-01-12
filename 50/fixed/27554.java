@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    configurationKeeper.create();
    createActivityModule();
    super.onCreate(savedInstanceState);
    viewInjector.inject(this, onCreateViewId());
}