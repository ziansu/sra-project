@java.lang.Override
public void onLayoutChildren(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state) {
    recyclerRef = recycler;
    if (state.isPreLayout()) {
        onPreLayoutChildren(recycler);
    }else {
        onRealLayoutChildren(recycler);
    }
}