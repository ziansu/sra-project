@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    tcBaseDelegate.setOverWriteTitle(false);
    try {
        app = getBaseApplicationInterface();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
    tcBaseDelegate.onCreate(this, savedInstanceState, app);
}