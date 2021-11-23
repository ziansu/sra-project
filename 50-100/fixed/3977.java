@java.lang.Override
public int getItemViewType(int position) {
    for (int i = 0; i < (pieces.getRawPieces().size()); i++) {
        com.xingstarx.mergeadapter.adapter.MergeRecyclerAdapter.PieceState piece = pieces.getRawPieces().get(i);
        if (piece.isActive) {
            int size = piece.adapter.getItemCount();
            if (position < size) {
                return piece.adapter.getItemViewType(position);
            }
            position -= size;
        }
    }
    return 0;
}