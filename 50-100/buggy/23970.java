@java.lang.Override
public void calculateModelMatrix(final org.rajawali3d.math.Matrix4 parentMatrix) {
    super.calculateModelMatrix(parentMatrix);
    if (mInverseZScale)
        mTmpScale.setAll(mScale.x, mScale.y, (-(mScale.z)));
    else
        mTmpScale.setAll(mScale.x, mScale.y, mScale.z);
    
    mMMatrix.identity().translate(mPosition).scale(mTmpScale).multiply(mRotationMatrix);
    if (parentMatrix != null)
        mMMatrix.leftMultiply(mParentMatrix);
    
}