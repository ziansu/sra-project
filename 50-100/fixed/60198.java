public void occursIn(final int partition) {
    for (int i = 0; i <= (mNumInterpolants); i++) {
        if (partition == (-1)) {
            mInA.set(i);
            mInB.set(i);
        }else
            if ((i < partition) || ((mStartOfSubtrees[i]) > partition)) {
                mInB.set(i);
            }else {
                mInA.set(i);
            }
        
    }
}