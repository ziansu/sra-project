@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    org.digitalillusion.droid.iching.utils.Utils.setContext(getApplicationContext());
    loadSettings();
    if ((current.viewId) == null) {
        gotoMain();
    }
}