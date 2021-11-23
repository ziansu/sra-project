@java.lang.Override
public void onLocationsLoaded(java.util.List<io.stormcast.app.stormcast.common.models.LocationModel> locationModels) {
    this.mLocationModels = locationModels;
    mViewPagerAdapter.setNumPages(locationModels.size());
    mViewPager.setCurrentItem(mPosition);
    showViewPager();
    customizeViews(locationModels.get(mViewPager.getCurrentItem()));
}