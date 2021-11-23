public void getLeafNames(java.util.ArrayList store, pal.treesearch.UnrootedMLSearcher.Connection caller) {
    for (int i = 0; i < (connections_.length); i++) {
        if ((connections_[i]) != caller) {
            connections_[i].getLeafNames(store, this);
        }
    }
}