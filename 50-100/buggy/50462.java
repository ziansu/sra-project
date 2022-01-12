@java.lang.Override
public void run() {
    try {
        ((android.app.Activity) (view.getContext())).finish();
        ((android.app.Activity) (view.getContext())).overridePendingTransition(enterAnim, ((exitAnim) == (-1) ? R.anim.fade_out_l : exitAnim));
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}