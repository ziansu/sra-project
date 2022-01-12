@java.lang.Override
public int getItemViewType(int position) {
    for (com.xingstarx.mergeadapter.adapter.MergeRecyclerAdapter.PieceState piece : pieces.getRawPieces()) {
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