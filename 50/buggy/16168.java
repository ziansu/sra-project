@java.lang.Override
public void onAnimationEnd(android.animation.Animator animation) {
    if (shouldClearOnOpen && ((editText.length()) > 0)) {
        editText.getText().clear();
    }
    editText.requestFocus();
}