@java.lang.Override
public java.lang.Object getItem(int position) {
    for (android.widget.ListAdapter piece : getPieces()) {
        int size = piece.getCount();
        if (position < size) {
            return piece.getItem(position);
        }
        position -= size;
    }
    return null;
}