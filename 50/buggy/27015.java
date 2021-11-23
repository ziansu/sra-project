public static com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment newInstance(com.flaredown.flaredownApp.Helpers.APIv2.EndPoints.CheckIns.TrackableType trackableType) {
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment.ARG_TRACKABLE_TYPE, trackableType);
    com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment fragment = new com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment();
    fragment.setArguments(args);
    return fragment;
}