@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mLocationsRepository = io.stormcast.app.stormcast.data.locations.LocationsRepository.getInstance(io.stormcast.app.stormcast.data.locations.local.LocalLocationsDataSource.getInstance(getActivity().getApplicationContext()));
    mHomePresenter = new io.stormcast.app.stormcast.home.HomePresenter(this, mLocationsRepository);
    mLocationModels = new java.util.ArrayList<>();
    mViewPagerAdapter = new io.stormcast.app.stormcast.home.HomeViewPagerAdapter(getChildFragmentManager(), mLocationModels);
}