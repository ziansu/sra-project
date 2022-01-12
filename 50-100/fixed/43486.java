public void setFrustum(org.joml.Matrix4f projMatrix) {
    if (projMatrix != null) {
        if ((mProjMatrix) == null) {
            mProjMatrix = new float[16];
        }
        mProjMatrix = projMatrix.get(mProjMatrix, 0);
        mScene.setPickVisible(false);
        if ((mCuller) != null) {
            mCuller.set(projMatrix);
        }else {
            mCuller = new org.joml.FrustumCuller(projMatrix);
        }
    }
    mProjection = projMatrix;
}