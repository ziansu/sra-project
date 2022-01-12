private void removeAllFragments() {
    if ((mFragments) == null) {
        return ;
    }
    int length = mFragments.length;
    for (int i = 0; i < length; i++) {
        for (int j = 0; j < length; ++j) {
            removeChild(mFragments[i][j], true);
        }
    }
}