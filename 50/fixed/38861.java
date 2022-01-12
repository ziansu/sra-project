@java.lang.Override
public void onPageSelected(int position) {
    if ((mUserPageListener) != null) {
        mUserPageListener.onPageSelected(position);
    }
}