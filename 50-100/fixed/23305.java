@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (android.text.TextUtils.isEmpty(newText)) {
        mNoteList = mDbHelper.queryAll();
    }else {
        mNoteList = mDbHelper.queryName(newText);
    }
    sortList(mNoteList);
    mAdapter.notifyDataSetChanged();
    return true;
}