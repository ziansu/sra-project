@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_step_details);
    com.stickyblob.bakingapp.fragments.StepDetailFragment stepDetailFragment = new com.stickyblob.bakingapp.fragments.StepDetailFragment();
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    fragmentManager.beginTransaction().add(R.id.steps_detail_container, stepDetailFragment).commit();
}