@java.lang.Override
public void OnRotation(float angle) {
    mYawR = ((float) (java.lang.Math.toRadians((-angle))));
    com.lvonasek.openconstructor.TangoJNINative.setView(((mYawM) + (mYawR)), mPitch, mMoveX, mMoveY, mMoveZ, (!(mViewMode)));
}