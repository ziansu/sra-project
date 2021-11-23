@java.lang.Override
public void onProgressChanged(android.widget.SeekBar seekBar, int progress, boolean fromUser) {
    if (fromUser && ((mProgressAnimator) != null)) {
        mProgressAnimator.cancel();
        mProgressAnimator = null;
    }
}