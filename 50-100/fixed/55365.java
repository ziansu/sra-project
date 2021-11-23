@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.example.buzalo.MainActivity.categories = new java.util.ArrayList<>();
    image = ((android.widget.ImageView) (findViewById(R.id.image)));
    com.example.buzalo.MainActivity.context = this;
    new com.example.buzalo.MainActivity.task().execute();
}