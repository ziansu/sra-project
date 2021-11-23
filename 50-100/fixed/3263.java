@java.lang.Override
public void setSelection(int position) {
    currentPosition = position;
    if (((position >= 0) && ((mAdapter) != null)) && (position < (mAdapter.getCount()))) {
        mNextX = position * (screenWidth);
        if ((positionChanger) != null) {
            positionChanger.onPositionChange(currentPosition);
        }
        this.requestLayout();
    }
}