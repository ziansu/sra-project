java.util.List<android.support.v7.widget.RecyclerView.Adapter> getPieces() {
    if ((active) == null) {
        active = new java.util.ArrayList<>();
        for (com.xingstarx.mergeadapter.adapter.MergeRecyclerAdapter.PieceState state : pieces) {
            if (state.isActive) {
                active.add(state.adapter);
            }
        }
    }
    return active;
}