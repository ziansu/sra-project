@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_exam_details);
    setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    dbHelper = new schmitt_florian.schoolplanner.logic.DatabaseHelperImpl(this);
    int examID = getIntent().getIntExtra("ExamID", (-1));
    if (examID <= 0) {
        addMode = true;
    }else {
        addMode = false;
        showingExam = dbHelper.getExamAtId(examID);
    }
    rootView = findViewById(R.id.examDetails_main);
    initGUI();
}