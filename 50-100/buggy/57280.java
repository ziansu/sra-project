@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    binding = android.databinding.DataBindingUtil.setContentView(this, R.layout.activity_main);
    fragmentManager = getSupportFragmentManager();
    assignmentListFragment = ((com.example.android.grader.fragments.AssignmentListFragment) (fragmentManager.findFragmentByTag(com.example.android.grader.activities.MainActivity.ASSIGNMENT_LIST_FRAGMENT)));
    if ((assignmentListFragment) == null) {
        assignmentListFragment = com.example.android.grader.fragments.AssignmentListFragment.newInstance();
        fragmentManager.beginTransaction().add(R.id.fragmentContainer, assignmentListFragment, com.example.android.grader.activities.MainActivity.ASSIGNMENT_LIST_FRAGMENT).addToBackStack(null).commit();
    }
}