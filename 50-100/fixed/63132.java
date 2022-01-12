@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (getArguments().containsKey(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID)) {
        mItemId = getArguments().getLong(com.example.xyzreader.ui.ArticleDetailFragment.ARG_ITEM_ID);
    }
    myTypeface = android.graphics.Typeface.createFromAsset(getActivity().getAssets(), "Rosario-Regular.ttf");
    mIsCard = getResources().getBoolean(R.bool.detail_is_card);
}