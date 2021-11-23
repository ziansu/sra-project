@java.lang.Override
public android.app.Fragment getItem(int position) {
    mCursor.moveToPosition(position);
    android.util.Log.v("TEST", ("getItem called position: " + position));
    return com.example.xyzreader.ui.ArticleDetailFragment.newInstance(mCursor.getLong(ArticleLoader.Query._ID), mStartId);
}