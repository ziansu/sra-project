@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_details_layout_comparison_tool);
    context = this;
    android.content.Intent intent = getIntent();
    if (null != intent) {
        education = ((demo.kolorob.kolorobdemoversion.model.EduNewDB.EduNewModel) (intent.getSerializableExtra(AppConstants.KEY_DETAILS_EDU)));
    }
    viewBaseLayout(education.getCommonModel());
    displayUniqueProperties();
    displayCommonProperties(education.getCommonModel());
}