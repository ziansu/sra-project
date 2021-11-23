@java.lang.Override
public void onClick(android.view.View v) {
    android.util.Log.d(com.prod.jvuil.vuforiatest.MainActivity.LOGTAG, "SubmitButton clicked");
    com.prod.jvuil.vuforiatest.ARRenderer.getInstance().setSelectedOverlay();
    buildTracker();
}