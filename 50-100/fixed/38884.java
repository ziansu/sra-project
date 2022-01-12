@java.lang.Override
public void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setHasOptionsMenu(true);
    setRetainInstance(true);
    new com.google.android.gms.common.api.GoogleApiClient.Builder(getActivity()).addApi(AppInvite.API).enableAutoManage(getActivity(), this).build();
    org.ogasimli.manat.ManatApplication application = ((org.ogasimli.manat.ManatApplication) (getActivity().getApplication()));
    mTracker = application.getDefaultTracker();
}