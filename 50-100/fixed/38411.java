@java.lang.Override
public boolean onEditorAction(android.widget.TextView v, int actionId, android.view.KeyEvent event) {
    if (actionId == (android.view.inputmethod.EditorInfo.IME_ACTION_DONE)) {
        if (checkInput()) {
            de.Maxr1998.xposed.maxlock.util.Util.hideKeyboardFromWindow(getActivity(), this);
        }else {
            setKey(null, false);
            v.startAnimation(android.view.animation.AnimationUtils.loadAnimation(getContext(), R.anim.shake));
            handleFailedAttempt();
        }
        return true;
    }
    return false;
}