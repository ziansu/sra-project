@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        android.os.Bundle arguments = new android.os.Bundle();
        arguments.putString(DetailWebViewFragment.DETAIL_URL, getIntent().getExtras().getString(DetailWebViewFragment.DETAIL_URL));
        com.grishman.rssfeed.fragments.DetailWebViewFragment fragment = new com.grishman.rssfeed.fragments.DetailWebViewFragment();
        fragment.setArguments(arguments);
        getSupportFragmentManager().beginTransaction().add(R.id.feeds_detail_container, fragment).commit();
    }
}