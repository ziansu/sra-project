@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_single_image);
    imageNumber = getIntent().getIntExtra("number", 0);
    singleImageViewPagerAdapter = new com.asimqasimzade.android.neatwallpapers.Adapters.SingleImageViewPagerAdapter(getSupportFragmentManager(), this, imageNumber);
    singleImageViewPager = ((android.support.v4.view.ViewPager) (findViewById(R.id.single_image_viewpager)));
    singleImageViewPager.setAdapter(singleImageViewPagerAdapter);
    singleImageViewPager.setOffscreenPageLimit(3);
}