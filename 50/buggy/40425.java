@java.lang.Override
public void onAnimationStart(android.view.animation.Animation animation) {
    android.util.Log.d(com.lapism.searchview.SearchAnimator.LOG_TAG, "fadeOpen() - onAnimationStart() callback invoked.");
    android.util.Log.d(com.lapism.searchview.SearchAnimator.LOG_TAG, java.lang.String.format("fadeOpen() - is OnOpenCloseListener set? %s", (listener != null)));
    if (listener != null) {
        listener.onOpen();
    }
}