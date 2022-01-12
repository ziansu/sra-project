@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    component().inject(this);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new com.example.dagger.activitygraphs.ui.HomeFragment()).commit();
    }
}