public void setUniforms(int index) {
    if ((mFilters.size()) <= index) {
        return ;
    }
    jp.co.cyberagent.android.gpuimage.GPUImageFilter filter = mFilters.get(index);
    filter.setFloatArray(mOffsetsLocation[index], mOffsets);
    filter.setFloatArray(mWeightsLocation[index], mWeights);
    filter.setInteger(mSampleLocation[index], (((mRadius) * 2) + 1));
}