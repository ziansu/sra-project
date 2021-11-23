private int saveRet(int oldRet, int l, int r) {
    assert r >= l;
    int newResult = (r - l) + 1;
    return min(oldRet, newResult);
}