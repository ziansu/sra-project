public int getSkeinsNeeded() {
    if ((mSkeinsNeeded) > (mSkeinsOwned)) {
        return (mSkeinsNeeded) - (mSkeinsOwned);
    }else {
        return 0;
    }
}