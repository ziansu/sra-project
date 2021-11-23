@java.lang.Override
public synchronized void setLayoutAlgorithm(android.webkit.LayoutAlgorithm l) {
    if (l == (LayoutAlgorithm.TEXT_AUTOSIZING)) {
        throw new java.lang.IllegalArgumentException("WebViewClassic does not support TEXT_AUTOSIZING layout mode");
    }
    if ((mLayoutAlgorithm) != l) {
        mLayoutAlgorithm = l;
        postSync();
    }
}