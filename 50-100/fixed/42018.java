@java.lang.Override
protected void onPostExecute(java.lang.String s) {
    if (accessOK) {
        mTimeline.updateListView(mTweetList, mCreatedAtList, mImageList, mLinkList);
        mCash.saveArrayList(jp.co.techmond.news_supercar.twitter.Strings.KEY_TWEET_TEXT, mTweetList);
        mCash.saveArrayList(jp.co.techmond.news_supercar.twitter.Strings.KEY_CREATED_AT, mCreatedAtList);
        mCash.saveArrayList(jp.co.techmond.news_supercar.twitter.Strings.KEY_IMG_URL, mImageList);
        mCash.saveArrayList(jp.co.techmond.news_supercar.twitter.Strings.KEY_LINK_URL, mLinkList);
    }else {
        showToast("接続に失敗しました。");
    }
    super.onPostExecute(s);
}