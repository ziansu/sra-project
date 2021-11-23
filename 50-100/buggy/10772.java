private boolean assertContiguous(gnu.trove.list.TIntList list) {
    if ((list.size()) < 2) {
        return true;
    }
    int prev = list.get(0);
    for (int i = 1; i < (list.size()); ++i) {
        int v = list.get(i);
        if (v == (prev - 1)) {
            prev = v;
            continue;
        }
        return false;
    }
    return true;
}