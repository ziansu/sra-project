@java.lang.Override
public void run() {
    try {
        ((android.app.Activity) (view.getContext())).finish();
        ((android.app.Activity) (view.getContext())).overridePendingTransition(enterAnim, exitAnim);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}