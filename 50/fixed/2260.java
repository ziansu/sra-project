public int getSkeinsToBuy() {
    if ((mSkeinsNeeded) > (mSkeinsOwned)) {
        return ((mSkeinsNeeded) - (mSkeinsOwned)) + (mSkeinsAdditional);
    }else {
        return mSkeinsAdditional;
    }
}