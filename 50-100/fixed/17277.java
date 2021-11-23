@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    for (int i = 0; i < (getPieces().size()); i++) {
        android.support.v7.widget.RecyclerView.Adapter piece = getPieces().get(i);
        int size = piece.getItemCount();
        if (position < size) {
            piece.onBindViewHolder(holder, position);
            break;
        }
        position -= size;
    }
}