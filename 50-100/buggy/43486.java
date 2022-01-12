public void setFrustum(org.joml.Matrix4f projMatrix) {
    if (projMatrix != null) {
        if ((mProjMatrix) == null) {
            mProjMatrix = new float[16];
        }
        mProjMatrix = projMatrix.get(mProjMatrix, 0);
        mScene.setPickVisible(false);
    }else {
        mScene.setPickVisible(true);
    }
    mProjection = projMatrix;
    if ((mCuller) != null) {
        mCuller.set(projMatrix);
    }else {
        mCuller = new org.joml.FrustumCuller(projMatrix);
    }
}