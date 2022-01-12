@java.lang.Override
public void onNewAssignmentClick() {
    createFragment = com.example.android.grader.fragments.CreateFragment.newInstance();
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, createFragment, com.example.android.grader.activities.MainActivity.CREATE_FRAGMENT).addToBackStack(null).commit();
}