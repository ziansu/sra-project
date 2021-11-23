@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_photogallery);
    com.bumptech.glide.request.target.ViewTarget.setTagId(R.id.glide_request);
    mUrls = getIntent().getStringArrayExtra(jzyu.github.photogallery.PhotoGalleryActivity.EXTRA_URLS);
    mViewPager = ((jzyu.github.photogallery.HackyViewPager) (findViewById(R.id.view_pager)));
    mViewPager.setAdapter(new jzyu.github.photogallery.PhotoGalleryActivity.SamplePagerAdapter());
    mViewPager.setCurrentItem(getIntent().getIntExtra(jzyu.github.photogallery.PhotoGalleryActivity.EXTRA_POSITION, 0));
    findViewById(R.id.button_original).setOnClickListener(this);
    findViewById(R.id.button_save).setOnClickListener(this);
}