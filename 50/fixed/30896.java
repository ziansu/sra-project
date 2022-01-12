public float[] createOffsetVerts(float offset, float pointerY) {
    applyCurveXEffect(offset);
    applyScaleXEffect(offset, pointerY);
    if ((mShader) == null)
        mShader = applyShadow(offset);
    
    return meshVerts;
}