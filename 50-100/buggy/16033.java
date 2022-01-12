@java.lang.Override
public android.content.Loader<com.m2e.cs5540.autopresence.base.AsyncLoaderStatus> onCreateLoader(int id, android.os.Bundle args) {
    java.lang.String courseId = getIntent().getStringExtra("courseId");
    if (courseId == null) {
        android.widget.Toast.makeText(this, ("StudentAttendanceActivity received null " + "courseId/userId from the intent!"), Toast.LENGTH_LONG).show();
        return null;
    }else {
        return new com.m2e.cs5540.autopresence.professors.ProfessorAttendanceAsyncTaskLoader(this, courseId);
    }
}