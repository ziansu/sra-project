@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (mAdapter.isSelectableItem(position)) {
        mAdapter.doClickOnItem(position);
    }
}