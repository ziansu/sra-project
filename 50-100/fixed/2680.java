@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String positionName = ((java.lang.String) (mAdapter.getItem(position)));
    mAdapter.remove(positionName);
    mListItems.remove(position);
    mAdapter.notifyDataSetChanged();
    if ((mTodoList.size()) == 0) {
        emptyListMessage.setVisibility(View.VISIBLE);
        mListView.setVisibility(View.INVISIBLE);
    }
    return false;
}