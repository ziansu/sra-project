@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    ivalarm = ((android.widget.ImageView) (findViewById(R.id.home_imageView_alarm)));
    ivdoor = ((android.widget.ImageView) (findViewById(R.id.home_imageView_door)));
    ivswith = ((android.widget.ImageView) (findViewById(R.id.home_imageView_switch)));
    new com.secureme.secureme.HomeActivity.asyncTask_getStatus().execute();
}