@java.lang.Override
public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder holder, int position) {
    for (android.support.v7.widget.RecyclerView.Adapter piece : getPieces()) {
        int size = piece.getItemCount();
        if (position < size) {
            piece.onBindViewHolder(holder, position);
            break;
        }
        position -= size;
    }
}