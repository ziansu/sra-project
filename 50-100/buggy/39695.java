@java.lang.Override
public boolean requestScroll() {
    return !((((mRecyclerView.getAdapter()) != null) && ((mRecyclerView.getAdapter().getItemCount()) > 0)) && ((((android.support.v7.widget.LinearLayoutManager) (mRecyclerView.getLayoutManager())).findFirstCompletelyVisibleItemPosition()) == 0));
}