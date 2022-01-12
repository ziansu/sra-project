@java.lang.Override
public void moveHandleToPosition(float scrollProgress) {
    if ((mScreenPositionCalculator) == null) {
        return ;
    }
    mHandle.setY(mScreenPositionCalculator.getYPositionFromScrollProgress(scrollProgress));
}