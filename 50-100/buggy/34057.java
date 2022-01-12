@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mBaseUrl = getArguments().getString(com.wherethismove.teamfortresstvmobile.pages.PageViewFragment.ARG_URL);
        mUrl = (mBaseUrl) + "/?page=1";
        mLayout = getArguments().getInt(com.wherethismove.teamfortresstvmobile.pages.PageViewFragment.ARG_LAYOUT);
    }
}