@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID)) {
        mItemId = getArguments().getLong(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID);
    }
    mIsCard = getResources().getBoolean(R.bool.detail_is_card);
    mStatusBarFullOpacityBottom = getResources().getDimensionPixelSize(R.dimen.detail_card_top_margin);
}