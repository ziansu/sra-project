@java.lang.Override
public void handleSnesClose() {
    android.util.Log.i("incomingstate", "handleSnesClose");
    snesState.closeCurrentListener();
}