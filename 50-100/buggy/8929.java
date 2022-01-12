private void updateStudent(int id, java.lang.String matricol, java.lang.String name, java.lang.String surname) {
    com.studios.lucian.students.model.Student student = new com.studios.lucian.students.model.Student(mCurrentGroup.getNumber(), matricol, name, surname);
    if (mStudentsDbHandler.updateStudent(student)) {
        mStudentsList.set(id, student);
        listAdapter.notifyDataSetChanged();
    }else {
        android.widget.Toast.makeText(getContext(), R.string.error_update_student, Toast.LENGTH_SHORT).show();
    }
}