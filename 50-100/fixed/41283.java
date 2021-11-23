@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_worker_option);
    isebase.cognito.tourpilot.StaticResources.StaticResources.setBaseContext(getBaseContext());
    instance = this;
    reloadData();
    mSectionsPagerAdapter = new isebase.cognito.tourpilot.Activity.TasksAssessmentsActivity.TasksAssessementsActivity.SectionsPagerAdapter(getSupportFragmentManager());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
    setTimeSync(true);
}