@java.lang.Override
protected void onStart() {
    super.onStart();
    if (this.getIntent().getBooleanExtra("skipToCourses", false)) {
        android.util.Log.d("iHW", ((("Year: " + (com.ihwapp.android.model.Curriculum.getCurrentYear())) + " / Campus: ") + (com.ihwapp.android.model.Curriculum.getCurrentCampus())));
        com.ihwapp.android.model.Curriculum.reloadCurrentCurriculum().addModelLoadingListener(this);
        campusLayout.setVisibility(View.GONE);
        coursesLayout.setVisibility(View.VISIBLE);
    }
}