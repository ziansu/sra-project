public static com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment newInstance(com.flaredown.flaredownApp.Helpers.APIv2.EndPoints.CheckIns.TrackableType trackableType) {
    com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment fragment = new com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(com.flaredown.flaredownApp.Checkin.CheckinCatalogQFragment.ARG_TRACKABLE_TYPE, trackableType);
    fragment.setArguments(args);
    return fragment;
}