public void showStudentListFragment() {
    android.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
    transaction.replace(R.id.class_details_frame, studentListFragment).addToBackStack("StudentList");
    transaction.commit();
    studentListFragment.getActivityContext(this);
    studentListFragment.getBatchID(batchID);
}