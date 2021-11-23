@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_place_types);
    butterknife.ButterKnife.bind(this);
    final java.lang.String country = getIntent().getStringExtra("COUNTRY");
    setToolbar();
    setPlacesList();
    setAdapter(country);
    setRecyclerView();
}