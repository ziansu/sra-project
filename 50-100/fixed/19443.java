@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    if (savedInstanceState == null) {
        getSupportFragmentManager().beginTransaction().add(R.id.container, new com.gtomato.android.demo.carouselviewdemo.ConfigFragment()).commit();
    }
    com.gtomato.android.ui.widget.CarouselView.setDebug(false);
}