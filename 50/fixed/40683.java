@java.lang.Override
public void onSuccess(final com.github.kulebin.myfoursquareapp.model.Venue venue) {
    mPresenter.setProgress(false);
    if (venue != null) {
        mPresenter.presentVenueToShowData(new com.github.kulebin.myfoursquareapp.view.VenueDisplayData(venue));
    }
}