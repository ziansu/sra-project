private int getCurrentPosition() {
    if (((mRecyclerView) != null) && (hasPostAdapter())) {
        return ((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager())).findFirstVisibleItemPosition();
    }else {
        return -1;
    }
}