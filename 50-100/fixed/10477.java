@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_course_selection);
    se.kth.csc.iprog.dinnerplanner.model.DinnerModel model = ((se.kth.csc.iprog.dinnerplanner.android.DinnerPlannerApplication) (this.getApplication())).getModel();
    new se.kth.csc.iprog.dinnerplanner.android.view.course.CourseTopView(findViewById(R.id.this_is_course_top_view_id), model);
    new se.kth.csc.iprog.dinnerplanner.android.view.course.TotalCostView(findViewById(R.id.this_is_total_cost_id), model);
    new se.kth.csc.iprog.dinnerplanner.android.view.course.CourseDownView(findViewById(R.id.this_is_course_down_view_id), model);
}