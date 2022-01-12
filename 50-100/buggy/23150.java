public java.util.List<T> getSelection() {
    final java.util.List<T> res = new java.util.ArrayList<>();
    final android.util.SparseBooleanArray pos = view.getCheckedItemPositions();
    for (int i = 0; i < (pos.size()); i++) {
        final int key = pos.keyAt(i);
        if (pos.valueAt(key)) {
            res.add(getItemAt(key));
        }
    }
    return res;
}