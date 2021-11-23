@java.lang.Override
public void onTouchingLetterChanged(java.lang.String s) {
    int position = adapter.getPositionForSection(s.charAt(0));
    if (position != (-1)) {
        sortListView.setSelection(position);
    }
}