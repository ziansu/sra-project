@java.lang.Override
public void run() {
    _activity.runOnUiThread(new java.lang.Runnable() {
        public void run() {
            loadViews(false, true, false);
        }
    });
}