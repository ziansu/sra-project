@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.viewPager)));
    viewPager.setOnPageChangeListener(new android.support.v4.view.ViewPager.SimpleOnPageChangeListener() {
        @java.lang.Override
        public void onPageSelected(int position) {
            getSupportActionBar().setSelectedNavigationItem(position);
        }
    });
    viewPager.setOffscreenPageLimit(5);
    parser = new brickhack.jive.Parser(this);
    server = new brickhack.jive.ServerAPI(this);
    server.refreshEvents();
}