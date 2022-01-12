@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_city);
    butterknife.ButterKnife.bind(this);
    android.content.Intent intent = this.getIntent();
    android.os.Bundle bundle = intent.getExtras();
    mCurrentCity = bundle.getString("city");
    initCities();
    initToolbar();
    initRecyclerView();
}