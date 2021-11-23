public org.rajawali3d.ATransformable3D setRotX(double rotX) {
    mTmpOrientation.setAll(mOrientation);
    mOrientation.fromEuler(mTmpOrientation.getYaw(), mTmpOrientation.getPitch(), rotX);
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}