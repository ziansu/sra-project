public int getLastPosition() {
    if (((mGridView) == null) || ((postsIds) == null)) {
        return 0;
    }
    int firstPos = mGridView.getFirstVisiblePosition();
    if ((firstPos >= 0) && (firstPos < (postsIds.size()))) {
        return postsIds.get(firstPos);
    }else {
        return 0;
    }
}