@java.lang.Override
protected void onResume() {
    super.onResume();
    android.util.Log.v("Nick", (" " + (mShowMainUI)));
    if (mShowMainUI) {
        loadMainUI();
    }
}