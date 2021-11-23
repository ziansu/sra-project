public org.rajawali3d.ATransformable3D setRotY(double rotY) {
    mTmpOrientation.setAll(mOrientation);
    mOrientation.fromEuler(rotY, mTmpOrientation.getPitch(false), mTmpOrientation.getRoll(false));
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}