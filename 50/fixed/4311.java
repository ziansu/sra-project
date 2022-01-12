public void addNeeded(int increment) {
    if ((mSkeinsNeeded) == 0) {
        mSkeinsNeeded = increment;
    }else {
        mSkeinsNeeded = (mSkeinsNeeded) + (increment - 1);
    }
}