public int getSkeinsToBuy() {
    if ((mSkeinsOwned) == 0) {
        return (mSkeinsNeeded) + (mSkeinsAdditional);
    }else {
        return ((mSkeinsNeeded) - ((mSkeinsOwned) - 1)) + (mSkeinsAdditional);
    }
}