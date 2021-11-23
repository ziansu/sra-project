@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    android.os.Bundle bundle = this.getIntent().getExtras();
    user_name = bundle.getString("userName");
    mImageView = ((android.widget.ImageView) (findViewById(R.id.mImageView)));
    initial_widget();
}