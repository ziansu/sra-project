@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_catalog);
    android.support.design.widget.FloatingActionButton fab = ((android.support.design.widget.FloatingActionButton) (findViewById(R.id.fab)));
    fab.setOnClickListener(new android.view.View.OnClickListener() {
        @java.lang.Override
        public void onClick(android.view.View view) {
            android.content.Intent intent = new android.content.Intent(com.example.android.pets.CatalogActivity.this, com.example.android.pets.EditorActivity.class);
            startActivity(intent);
        }
    });
}