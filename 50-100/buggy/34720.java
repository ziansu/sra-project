@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    android.util.Log.d(com.lapism.searchview.SearchAnimator.LOG_TAG, "fadeOpen() - onAnimationEnd() callback invoked.");
    view.setVisibility(View.VISIBLE);
    view.clearAnimation();
    if (shouldClearOnOpen && ((editText.length()) > 0)) {
        editText.getText().clear();
    }
    editText.requestFocus();
}