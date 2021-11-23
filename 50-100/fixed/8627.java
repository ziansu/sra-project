@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    java.lang.System.out.println("HomeFragment.onCreate");
    mPageChangeListener = new com.pratilipi.mobile.android.homescreen.home.HomeFragment.HomePageChangeListener();
    java.util.ArrayList<java.lang.String> stringArrayList = new java.util.ArrayList(java.util.Arrays.asList(mActivity.getResources().getStringArray(R.array.loading_quotes_array)));
    mProgressHandler = new com.pratilipi.mobile.android.widget.AnimatedProgressIndicator(mActivity, stringArrayList);
}