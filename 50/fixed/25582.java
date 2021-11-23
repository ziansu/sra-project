@android.support.annotation.UiThread
@java.lang.Override
public T remove(int i) {
    final T removed = mData.remove(i);
    org.spacebison.recyclerviewlistadapter.RecyclerViewListAdapter.notifyItemRemoved(i);
    return removed;
}