public org.rajawali3d.ATransformable3D setRotation(final org.rajawali3d.math.vector.Vector3 axis, double angle) {
    mOrientation.fromAngleAxis(axis, angle);
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}