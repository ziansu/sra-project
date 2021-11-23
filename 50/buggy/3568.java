@java.lang.Override
public void onAssignmentClick(com.example.android.grader.models.Assignment assignment) {
    com.example.android.grader.fragments.AssignmentDetailFragment assignmentDetailFragment = com.example.android.grader.fragments.AssignmentDetailFragment.newInstance(assignment);
    fragmentManager.beginTransaction().replace(R.id.fragmentContainer, assignmentDetailFragment, com.example.android.grader.activities.MainActivity.ASSIGNMENT_DETAIL_FRAGMENT).addToBackStack(null).commit();
}