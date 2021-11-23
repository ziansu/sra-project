@java.lang.Override
public void onResume() {
    super.onResume();
    mScrollView.setFocusable(true);
    mScrollView.setFocusableInTouchMode(true);
    mScrollView.requestFocus();
}