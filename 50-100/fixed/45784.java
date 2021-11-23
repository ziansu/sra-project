@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_category);
    setTitle("Top 25");
    android.content.Intent intent = getIntent();
    getSupportFragmentManager().beginTransaction().replace(R.id.container, new com.example.hp.main.topHundredFragment()).commit();
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}