private boolean hasHeader(int position) {
    if ((position == 0) && ((mAdapter.getHeaderId(position)) != (android.support.v7.widget.RecyclerView.NO_ID))) {
        return true;
    }
    int previous = position - 1;
    return ((mAdapter.getHeaderId(position)) != (android.support.v7.widget.RecyclerView.NO_ID)) && ((mAdapter.getHeaderId(position)) != (mAdapter.getHeaderId(previous)));
}