@java.lang.Override
public void run() {
    this.mPrepressed = true;
    this.setPressed(true);
    if (this.mRippleHover) {
        startHover();
    }
}