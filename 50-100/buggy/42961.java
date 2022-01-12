protected boolean onDoneEvent(int actionId, android.view.KeyEvent event) {
    if (didPressEnterKey(actionId, event)) {
        if (!(isUserDataValid())) {
            return true;
        }
        android.view.View view = getActivity().getCurrentFocus();
        if (view != null)
            org.wordpress.android.util.WPActivityUtils.hideKeyboard(view);
        
        onDoneAction();
        return true;
    }
    return false;
}