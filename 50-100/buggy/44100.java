@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.example.dagger.activitygraphs.ui.Dagger_HomeActivity_HomeComponent.builder().applicationComponent(((com.example.dagger.activitygraphs.ui.DemoApplication) (getApplication())).component()).activityModule(new com.example.dagger.activitygraphs.ui.ActivityModule(this)).build().inject(this);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(android.R.id.content, new com.example.dagger.activitygraphs.ui.HomeFragment()).commit();
    }
}