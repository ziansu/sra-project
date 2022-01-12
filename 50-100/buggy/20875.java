public void getLeafNames(java.util.ArrayList store, pal.treesearch.UnrootedMLSearcher.UNode caller) {
    if (caller == (leftNode_)) {
        rightNode_.getLeafNames(store, this);
    }else
        if (caller == (rightNode_)) {
            leftNode_.getLeafNames(store, this);
        }else {
            throw new java.lang.RuntimeException("Unknown caller!");
        }
    
}