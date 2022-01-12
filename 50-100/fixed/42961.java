protected boolean onDoneEvent(int actionId, android.view.KeyEvent event) {
    if (didPressEnterKey(actionId, event)) {
        if (!(isUserDataValid())) {
            return true;
        }
        if ((getActivity()) != null) {
            org.wordpress.android.util.WPActivityUtils.hideKeyboard(getActivity().getCurrentFocus());
        }
        onDoneAction();
        return true;
    }
    return false;
}