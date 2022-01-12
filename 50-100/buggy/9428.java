@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_results);
    android.support.v7.widget.Toolbar toolbar = ((android.support.v7.widget.Toolbar) (findViewById(R.id.toolbar)));
    setSupportActionBar(toolbar);
    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    android.widget.TextView display = ((android.widget.TextView) (findViewById(R.id.textView_results)));
    android.content.Intent intentResults = getIntent();
    java.lang.String APIRequestURL = intentResults.getStringExtra("APIURL");
    display.setText(APIRequestURL);
    showAlert(APIRequestURL);
}