@java.lang.Override
protected void applyTransformation(float interpolatedTime, android.view.animation.Transformation t) {
    moveAndRotate((((int) ((mX) * (1 - interpolatedTime))) + (mDx)), (((int) ((mY) * (1 - interpolatedTime))) + (mDy)));
}