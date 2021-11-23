@java.lang.Override
public void onPageSelected(int position) {
    mCurrentOffset = 0;
    mCurrentPosition = position;
    invalidate();
}