@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (android.text.TextUtils.isEmpty(newText)) {
        mNoteList = mDbHelper.queryAll();
        sortList(mNoteList);
        mAdapter.notifyDataSetChanged();
    }else {
        mNoteList = mDbHelper.queryName(newText);
        sortList(mNoteList);
        mAdapter.notifyDataSetChanged();
    }
    return true;
}