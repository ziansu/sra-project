@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    tcBaseDelegate.setOverWriteTitle(false);
    tcBaseDelegate.onCreate(this, savedInstanceState);
    try {
        app = getBaseApplicationInterface();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}