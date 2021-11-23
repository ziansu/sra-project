@java.lang.Override
public void onRotate(float angleDelta) {
    final float centerX = (getMeasuredWidth()) / 2;
    final float centerY = (getMeasuredHeight()) / 2;
    mMatrix.postRotate(angleDelta, centerX, centerY);
    setImageMatrix(mMatrix);
}