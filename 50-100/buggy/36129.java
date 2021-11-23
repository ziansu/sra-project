public android.view.View getItemViewByPosition(int pos, android.widget.ListView listView) {
    final int firstListItemPosition = listView.getFirstVisiblePosition();
    final int lastListItemPosition = (firstListItemPosition + (listView.getChildCount())) - 1;
    if ((pos < firstListItemPosition) || (pos > lastListItemPosition)) {
        return listView.getAdapter().getView(pos, null, listView);
    }else {
        final int childIndex = pos - firstListItemPosition;
        return listView.getChildAt(childIndex);
    }
}