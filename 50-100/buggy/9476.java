public int getLastPosition() {
    if (((mGridView) == null) || ((postsIds) == null)) {
        return 0;
    }
    int firstPos = mGridView.getFirstVisiblePosition();
    if (firstPos >= 0) {
        return postsIds.get(mGridView.getFirstVisiblePosition());
    }else {
        return 0;
    }
}