@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    butterknife.ButterKnife.bind(this);
    mRecyclerView.setLayoutManager(new android.support.v7.widget.LinearLayoutManager(this));
    mStudentSQLiteHelper = edu.lclark.studentdatabaseapp.StudentSQLiteHelper.getInstance(getApplicationContext());
    mStudentAdapter = new edu.lclark.studentdatabaseapp.StudentAdapter(mStudentSQLiteHelper.getAllStudents());
    mRecyclerView.setAdapter(mStudentAdapter);
    mStudentSQLiteHelper.initialize();
}