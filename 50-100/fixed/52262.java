@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.techsntipsactivity);
    actionBar = getSupportActionBar();
    actionBar.setDisplayHomeAsUpEnabled(true);
    title = getIntent().getStringExtra("ActivityTitle");
    actionBar.setTitle(title);
    actionBar.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(Constants.primaryColor)));
    initFrag(getIntent().getStringExtra("ActivityTitle"));
}