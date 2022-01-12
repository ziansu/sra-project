@java.lang.Override
public synchronized void setLayoutAlgorithm(android.webkit.LayoutAlgorithm l) {
    if (l == (LayoutAlgorithm.TEXT_AUTOSIZING)) {
        return ;
    }
    if ((mLayoutAlgorithm) != l) {
        mLayoutAlgorithm = l;
        postSync();
    }
}