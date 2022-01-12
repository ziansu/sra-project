@java.lang.Override
protected void onStart() {
    super.onStart();
    if (this.getIntent().getBooleanExtra("skipToCourses", false)) {
        com.ihwapp.android.model.Curriculum.reloadCurrentCurriculum().addModelLoadingListener(this);
        campusLayout.setVisibility(View.GONE);
        coursesLayout.setVisibility(View.VISIBLE);
    }
}