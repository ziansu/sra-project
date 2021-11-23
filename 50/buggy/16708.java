@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    new riyanshkarani011235.com.github.io.models_test_app.LoadFromJson();
    android.content.Intent intent = new android.content.Intent(this, riyanshkarani011235.com.github.io.models_test_app.LoginActivity.class);
    startActivity(intent);
}