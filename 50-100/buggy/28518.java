@java.lang.Override
public boolean onQueryTextChange(java.lang.String newText) {
    if (!(newText.equals(""))) {
        mAdapter = new framgia.vn.framgiacrb.adapter.SearchEventAdapter(this, framgia.vn.framgiacrb.object.RealmController.with(this).searchEvent(newText));
        mRecycler.setAdapter(mAdapter);
    }
    return false;
}