@java.lang.Override
public void onAnimationEnd(android.view.animation.Animation animation) {
    view.setVisibility(View.VISIBLE);
    if (shouldClearOnOpen && ((editText.length()) > 0)) {
        editText.getText().clear();
    }
    editText.requestFocus();
}