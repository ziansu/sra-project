@java.lang.Override
public long getItemId(int position) {
    for (int i = 0; i < (getPieces().size()); i++) {
        android.widget.ListAdapter piece = getPieces().get(i);
        int size = piece.getCount();
        if (position < size) {
            return piece.getItemId(position);
        }
        position -= size;
    }
    return -1;
}