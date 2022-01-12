@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_detail);
    android.content.Intent intent = getIntent();
    symbol = intent.getStringExtra("symbol");
    butterknife.ButterKnife.bind(this);
    android.graphics.drawable.Drawable fadeBlue = android.support.v4.content.ContextCompat.getDrawable(this, R.drawable.fade_blue);
    com.fantasystock.fantasystock.Activities.DetailActivity.DetailsPagerAdapter detailsPagerAdapter = new com.fantasystock.fantasystock.Activities.DetailActivity.DetailsPagerAdapter(getSupportFragmentManager(), fadeBlue);
    vpViewPager.setAdapter(detailsPagerAdapter);
    setCurrentPageToStock(symbol);
}