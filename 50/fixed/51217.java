private void updateUI() {
    mAdapter = new com.oestjacobsen.android.get2gether.view.groups.SelectedGroupMembersFragment.MembersAdapter(mMembersList);
    mRecyclerView.setAdapter(mAdapter);
}