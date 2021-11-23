@java.lang.Override
public void onAnimationEnd() {
    if ((mIconComplete) != 0) {
        setText(null);
        setIcon(mIconComplete);
    }else {
        setText(mCompleteText);
    }
    mMorphingInProgress = false;
    mState = com.dd.CircularProgressButton.State.COMPLETE;
}