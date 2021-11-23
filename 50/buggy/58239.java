private void doLoadReddit(java.lang.String url) {
    me.ccrama.redditslide.Views.RedditItemView v = ((me.ccrama.redditslide.Views.RedditItemView) (findViewById(R.id.reddit_item)));
    v.loadUrl(url);
}