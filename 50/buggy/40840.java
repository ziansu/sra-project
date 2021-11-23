@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    if ((www.weride.com.fragments.MapFragment.class) == (fragmentManager.findFragmentById(R.id.flContent).getClass())) {
        toolbar.removeView(findViewById(R.id.search_toolbar));
        swapToMapToolbar();
    }
}