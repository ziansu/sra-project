java.util.List<android.support.v7.widget.RecyclerView.Adapter> getPieces() {
    if ((active) == null) {
        active = new java.util.ArrayList<>();
        for (int i = 0; i < (pieces.size()); i++) {
            com.xingstarx.mergeadapter.adapter.MergeRecyclerAdapter.PieceState state = pieces.get(i);
            if (state.isActive) {
                active.add(state.adapter);
            }
        }
    }
    return active;
}