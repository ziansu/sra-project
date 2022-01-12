@java.lang.Override
public void onClick(android.view.View v) {
    mSeekBar.setProgress(((mSeekBar.getProgress()) - 1));
    if ((mOnSeekBarListener) != null) {
        mOnSeekBarListener.onStop(this, mProgress, mItems.get(mProgress));
    }
}