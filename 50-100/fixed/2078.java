@java.lang.Override
public android.view.View getView(int position, android.view.View convertView, android.view.ViewGroup parent) {
    for (int i = 0; i < (getPieces().size()); i++) {
        android.widget.ListAdapter piece = getPieces().get(i);
        int size = piece.getCount();
        if (position < size) {
            return piece.getView(position, convertView, parent);
        }
        position -= size;
    }
    return null;
}