@java.lang.Override
public void onScrollStateChanged(android.support.v7.widget.RecyclerView recyclerView, int newState) {
    android.support.v7.widget.LinearLayoutManager layoutManager = ((android.support.v7.widget.LinearLayoutManager) (recyclerView.getLayoutManager()));
    int lastPosition = layoutManager.findLastCompletelyVisibleItemPosition();
    if (lastPosition == ((mAdapter.getItemCount()) - 1)) {
        mListViewModel.loadNextPageZhihu(lastPosition);
    }
}