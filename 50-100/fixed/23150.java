public java.util.List<T> getSelection() {
    final java.util.List<T> res = new java.util.ArrayList<>();
    final android.util.SparseBooleanArray pos = view.getCheckedItemPositions();
    for (int i = 0; i < (pos.size()); i++) {
        if (pos.valueAt(i)) {
            res.add(getItemAt(pos.keyAt(i)));
        }
    }
    return res;
}