@java.lang.Override
public long getItemId(int position) {
    for (android.widget.ListAdapter piece : getPieces()) {
        int size = piece.getCount();
        if (position < size) {
            return piece.getItemId(position);
        }
        position -= size;
    }
    return -1;
}