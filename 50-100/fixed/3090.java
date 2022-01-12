@java.lang.Override
public boolean isEnabled(int position) {
    for (int i = 0; i < (getPieces().size()); i++) {
        android.widget.ListAdapter piece = getPieces().get(i);
        int size = piece.getCount();
        if (position < size) {
            return piece.isEnabled(position);
        }
        position -= size;
    }
    return false;
}