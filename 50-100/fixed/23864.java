@java.lang.Override
public void onSuccess(final java.util.List<com.github.kulebin.myfoursquareapp.model.Venue> pVenueList) {
    mPresenter.setProgress(false);
    if (pVenueList != null) {
        final java.util.List<com.github.kulebin.myfoursquareapp.view.VenueDisplayData> venueToShowList = new java.util.ArrayList(pVenueList.size());
        for (final com.github.kulebin.myfoursquareapp.model.Venue venue : pVenueList) {
            venueToShowList.add(new com.github.kulebin.myfoursquareapp.view.VenueDisplayData(venue));
        }
        mPresenter.presentVenueToShowData(venueToShowList);
    }
}