@java.lang.Override
public void onTextChanged(java.lang.CharSequence cs, int arg1, int arg2, int arg3) {
    mSearchQuery = cs.toString();
    mAdapter = ((com.lastsoft.plog.MainActivity) (mActivity)).initPlayAdapter(mSearchQuery, fromDrawer, playListType);
    mRecyclerView.setAdapter(mAdapter);
}