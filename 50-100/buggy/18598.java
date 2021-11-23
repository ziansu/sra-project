@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_new_marker);
    android.support.v7.widget.Toolbar toolbar = findViewById(R.id.marker_layout_toolbar);
    toolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View v) {
            android.content.Intent intent = new android.content.Intent(com.scarfaiz.cluckinbell.NewMarkerActivity.this, com.scarfaiz.cluckinbell.MainActivity.class);
            startActivity(intent);
        }
    });
}