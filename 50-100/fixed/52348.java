@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    details = ((com.commonsware.android.eu4you.DetailsFragment) (getFragmentManager().findFragmentById(android.R.id.content)));
    if ((details) == null) {
        details = new com.commonsware.android.eu4you.DetailsFragment();
        getFragmentManager().beginTransaction().add(android.R.id.content, details).commit();
    }
    url = getIntent().getStringExtra(com.commonsware.android.eu4you.DetailsActivity.EXTRA_URL);
}