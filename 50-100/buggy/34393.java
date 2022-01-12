@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_search);
    mSectionsPagerAdapter = new arudra.mycompany.com.assignment4.Search.SectionsPagerAdapter(getSupportFragmentManager());
    mViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    mViewPager.setAdapter(mSectionsPagerAdapter);
    arudra.mycompany.com.assignment4.BioDatabase database = new arudra.mycompany.com.assignment4.BioDatabase(getApplicationContext());
    arudra.mycompany.com.assignment4.Search.sqLiteDatabase = database.getReadableDatabase();
}