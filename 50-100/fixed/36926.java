@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_dashboard);
    android.view.View members = findViewById(R.id.btn_members);
    android.view.View books = findViewById(R.id.btn_books);
    books.setOnClickListener(this);
    findViewById(R.id.btn_logout).setOnClickListener(this);
    members.setOnClickListener(this);
}