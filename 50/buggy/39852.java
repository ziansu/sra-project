private void getExtrasFromIntent() {
    com.mpfarmer.facebookintegration.model.Friend friend = ((com.mpfarmer.facebookintegration.model.Friend) (getIntent().getSerializableExtra(com.mpfarmer.facebookintegration.FriendDetailActivity.EXTRA_FRIEND)));
    setTitle(friend.getName());
}