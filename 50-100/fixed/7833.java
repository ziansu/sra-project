@java.lang.Override
public void onAttachedToRecyclerView(android.support.v7.widget.RecyclerView recyclerView) {
    if ((mRunnables.size()) == 0) {
        int count = getItemCount();
        for (int i = 0; i < count; i++) {
            mRunnables.add(null);
        }
    }
    registerAdapterDataObserver(new com.tr4android.recyclerviewslideitem.SwipeAdapter.SwipeAdapterDataObserver());
}