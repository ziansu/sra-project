public boolean needToBuy() {
    return (((mSkeinsNeeded) > 0) && ((mSkeinsNeeded) > ((mSkeinsOwned) - 1))) || ((mSkeinsAdditional) > 0);
}