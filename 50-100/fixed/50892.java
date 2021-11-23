@java.lang.Override
public int getItemCount() {
    if (mInvalidates) {
        mInvalidates = false;
        synchronized(tree) {
            tree = new de.wilson.wdtreelistlibrary.WDTreeLeaf();
            mCount = 0;
            mPreviousLeaf = null;
            generateStructure(null, 0, tree.getChildren());
        }
    }
    return mCount;
}