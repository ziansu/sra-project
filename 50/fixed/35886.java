private void InitUI() {
    butterknife.ButterKnife.bind(this);
    swipeLayout.setOnRefreshListener(this);
    avatar.setImageResource(R.drawable.octocat);
}