@java.lang.Override
public void onPageSelected(int position) {
    animatePage(position);
    if ((mUserPageListener) != null) {
        mUserPageListener.onPageSelected(position);
    }
}