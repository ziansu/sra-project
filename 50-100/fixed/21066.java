@java.lang.Override
public java.lang.Object getItem(int position) {
    for (int i = 0; i < (getPieces().size()); i++) {
        android.widget.ListAdapter piece = getPieces().get(i);
        int size = piece.getCount();
        if (position < size) {
            return piece.getItem(position);
        }
        position -= size;
    }
    return null;
}