@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    try {
        app = getBaseApplicationInterface();
    } catch (java.lang.Exception e) {
    }
    tcBaseDelegate.onCreate(this, savedInstanceState, app);
    app.addActivity(this);
}