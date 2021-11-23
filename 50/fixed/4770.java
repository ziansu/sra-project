private void initViews() {
    mTweetAdapter = new com.thoughtworks.wechat.adapter.TweetAdapter(this);
    mHeaderView = android.view.LayoutInflater.from(this).inflate(R.layout.tweet_header, mTweetListView, false);
    mTweetListView.addHeaderView(mHeaderView);
    mTweetListView.setAdapter(mTweetAdapter);
}