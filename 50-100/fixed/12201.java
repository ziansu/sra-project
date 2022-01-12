public void makeSmall() {
    for (int i = 0; i < (first.adapter.vList.size()); i++) {
        ((android.widget.TextView) (first.adapter.vList.get(i))).setTextSize(TypedValue.COMPLEX_UNIT_SP, 70);
    }
}