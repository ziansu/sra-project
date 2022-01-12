@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    if (!(query.equals(""))) {
        mAdapter = new framgia.vn.framgiacrb.adapter.SearchEventAdapter(this, framgia.vn.framgiacrb.object.RealmController.with(this).searchEvent(query));
        mRecycler.setAdapter(mAdapter);
    }
    return false;
}