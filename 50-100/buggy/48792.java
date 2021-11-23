private int saveRet(int oldRet, int l, int r) {
    assert r >= l;
    if (l == r) {
        return oldRet;
    }
    int newResult = (r - l) + 1;
    return min(oldRet, newResult);
}