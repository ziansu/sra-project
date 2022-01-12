@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    GenerateSomeFriends();
    android.support.v4.view.ViewPager viewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.vp_mainActivity)));
    com.example.emcako.birthdayreminder.MainActivity.mainPageAdapter = new com.example.emcako.birthdayreminder.MainActivity.MainPageAdapter(getSupportFragmentManager());
    viewPager.setAdapter(com.example.emcako.birthdayreminder.MainActivity.mainPageAdapter);
}