private void deleteStudent(int id) {
    com.studios.lucian.students.model.Student student = mStudentsList.get(id);
    if (mStudentsDbHandler.deleteStudent(student)) {
        mGroupDao.decreaseCount(mCurrentGroup);
        ((com.studios.lucian.students.activity.MainActivity) (getActivity())).getMainFragment().syncGroups();
        mStudentsList.remove(id);
        listAdapter.notifyDataSetChanged();
    }else {
        android.widget.Toast.makeText(getActivity(), R.string.student_not_found, Toast.LENGTH_SHORT).show();
    }
}