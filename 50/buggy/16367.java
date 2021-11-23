@java.lang.Override
protected void onResume() {
    super.onResume();
    mData = mUserDAO.getPending();
    mAdapter = new cn.thu.guohao.simplechat.adapter.InvitationsAdapter(this, mData, mCurrUser);
    mListView.setAdapter(mAdapter);
}