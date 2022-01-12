@java.lang.Override
public void setUsersInUI(java.util.List<com.rukiasoft.githubfetcher.model.UserBasic> users) {
    com.rukiasoft.githubfetcher.ui.adapters.UsersAdapter mAdapter = new com.rukiasoft.githubfetcher.ui.adapters.UsersAdapter(users);
    mAdapter.setOnCardClickListener(this);
    mRecyclerView.setAdapter(mAdapter);
}