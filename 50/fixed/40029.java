public org.rajawali3d.ATransformable3D setRotZ(double rotZ) {
    mTmpOrientation.setAll(mOrientation);
    mOrientation.fromEuler(mTmpOrientation.getYaw(), rotZ, mTmpOrientation.getRoll());
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}