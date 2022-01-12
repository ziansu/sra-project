@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    if (savedInstanceState == null) {
        maniteja.com.popularmovies.DetailActivityFragment fragment = new maniteja.com.popularmovies.DetailActivityFragment();
        android.support.v4.app.FragmentManager manager = getSupportFragmentManager();
        android.support.v4.app.FragmentTransaction transaction = manager.beginTransaction().add(R.id.detailFragment_container, fragment);
        transaction.commit();
    }
}