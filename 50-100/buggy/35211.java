@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.pager)));
    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
    viewPager.setAdapter(new com.example.idk.myuber.MyAdapter(fragmentManager));
}