@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID)) {
        mItemId = getArguments().getLong(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID);
    }
    if (getArguments().containsKey(com.example.xyzreader.ui.ArticleDetailFragment.ARG_POSITION)) {
        mStartingPosition = getArguments().getInt(com.example.xyzreader.ui.ArticleDetailFragment.ARG_POSITION);
    }
    mItemPosition = getArguments().getInt(com.example.xyzreader.ui.ArticleDetailFragment.ARG_CURRENTPOSITION);
    mIsTransitioning = (savedInstanceState == null) && ((mStartingPosition) == (mItemPosition));
    mBackgroundImageFadeMillis = 1000;
}