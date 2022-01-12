@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(com.lu_xinghe.project600final.newsDetails.NewsDetailsViewPagerFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(com.lu_xinghe.project600final.newsDetails.NewsDetailsViewPagerFragment.ARG_PARAM2);
    }
}