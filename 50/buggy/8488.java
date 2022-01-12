@java.lang.Override
public void onTick(long millisUntilFinished) {
    android.util.Log.d("Autosave", ("time left: " + (millisUntilFinished - (historian.timeSinceChange))));
    editorActivity.setSaveStatusBar(false);
}