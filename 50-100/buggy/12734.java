@java.lang.Override
public void onScrolled(android.support.v7.widget.RecyclerView recyclerView, int dx, int dy) {
    visibleItemCount = manager.getChildCount();
    totalItemCount = manager.getItemCount();
    pastVisiblesItems = manager.findFirstVisibleItemPosition();
    if (!(loading)) {
        if (((visibleItemCount) + (pastVisiblesItems)) >= (totalItemCount)) {
            (pageIndex)++;
            getBooks(pageIndex);
            android.util.Log.v("...", "Last Item Wow !");
        }
    }
}