private boolean focusOnValue(android.widget.LinearLayout rowLayout, java.lang.String key) {
    boolean found = false;
    for (int i = (rowLayout.getChildCount()) - 1; i >= 0; --i) {
        de.blau.android.propertyeditor.TagEditorFragment.TagEditRow ter = ((de.blau.android.propertyeditor.TagEditorFragment.TagEditRow) (rowLayout.getChildAt(i)));
        if (ter.getKey().equals(key)) {
            focusRowValue(rowLayout, rowIndex(rowLayout, ter));
            found = true;
            break;
        }
    }
    return found;
}