@java.lang.Override
public int delete(android.net.Uri uri, java.lang.String selection, java.lang.String[] selectionArgs) {
    int code = com.thoughtworks.wechat.WxContentProvider.uriMatcher.match(uri);
    switch (code) {
        case com.thoughtworks.wechat.WxContentProvider.TWEET_ID :
            java.lang.String tweetId = DataBaseContract.Tweets.getId(uri);
            selection = ((DataBaseContract.Tweets._ID) + "=") + tweetId;
            selectionArgs = null;
        case com.thoughtworks.wechat.WxContentProvider.TWEET :
            return mDatabaseHelper.getWritableDatabase().delete(DataBaseContract.Tweets.TABLE_NAME, selection, selectionArgs);
        default :
            throw new java.lang.IllegalArgumentException((("The uri '" + uri) + "' is not supported by this ContentProvider"));
    }
}