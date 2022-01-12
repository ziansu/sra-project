public org.rajawali3d.ATransformable3D setRotation(final org.rajawali3d.math.Matrix4 matrix) {
    mOrientation.fromMatrix(matrix);
    mLookAtValid = false;
    markModelMatrixDirty();
    return this;
}