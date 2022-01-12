@java.lang.Override
public boolean isEnabled(int position) {
    for (android.widget.ListAdapter piece : getPieces()) {
        int size = piece.getCount();
        if (position < size) {
            return piece.isEnabled(position);
        }
        position -= size;
    }
    return false;
}