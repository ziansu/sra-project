@java.lang.Override
public void run() {
    com.tuesda.walker.circlerefresh.Activity activity = ((com.tuesda.walker.circlerefresh.Activity) (context));
    activity.runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            back();
        }
    });
}