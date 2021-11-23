@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    if ((interpolatedTime != 1.0) && ((mView) != null)) {
        moveAndRotate((((mX) * (1 - interpolatedTime)) + (mDx)), (((mY) * (1 - interpolatedTime)) + (mDy)));
    }else {
        mView = null;
    }
}