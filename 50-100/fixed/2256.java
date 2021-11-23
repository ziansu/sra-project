@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    super.onScrolled(recyclerView, dx, dy);
    if ((queryModel.allAdded) && ((linearLayoutManager.getItemCount()) <= ((linearLayoutManager.findLastVisibleItemPosition()) + (io.github.deepbluecitizenservice.citizenservice.database.QueryModel.OFFSET_VIEW)))) {
        queryModel.makeQuery(queryModel.lastSeen, ref[0], adapter, refreshLayout);
    }
}