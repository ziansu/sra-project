@java.lang.Override
public android.support.v4.content.Loader<java.lang.Boolean> onCreateLoader(int id, android.os.Bundle args) {
    mProgressBar.setVisibility(View.VISIBLE);
    switch (id) {
        case R.id.rss_feed_loader :
            final java.lang.String[] sources = getResources().getStringArray(R.array.rss_sources_array);
            return new com.friendoye.rss_reader.loaders.RssFeedLoader(this, sources);
        default :
            throw new java.lang.RuntimeException("There's no loader with given id.");
    }
}