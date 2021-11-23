@java.lang.Override
public void onSuccess(final com.github.kulebin.myfoursquareapp.model.Venue venue) {
    mPresenter.setProgress(false);
    mPresenter.presentVenueToShowData(new com.github.kulebin.myfoursquareapp.view.VenueDisplayData(venue));
    android.util.Log.d("ShowDetailVenueUseCase", venue.getName());
}