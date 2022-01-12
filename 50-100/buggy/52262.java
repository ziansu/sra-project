@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.techsntipsactivity);
    se.chalmers.datx02_15_36.studeraeffektivt.activity.ActionBar actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
    actionBar.setTitle(getIntent().getStringExtra("ActivityTitle"));
    actionBar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(Constants.primaryColor)));
    initFrag(getIntent().getStringExtra("ActivityTitle"));
}