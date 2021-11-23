public int getSkeinsNeeded() {
    if ((mSkeinsOwned) == 0) {
        return mSkeinsNeeded;
    }else {
        return (mSkeinsNeeded) - ((mSkeinsOwned) - 1);
    }
}