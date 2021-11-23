@java.lang.Override
public void onDestroy() {
    adapter = null;
    if ((galleryViewPager) != null)
        galleryViewPager.setAdapter(null);
    
    super.onDestroy();
}