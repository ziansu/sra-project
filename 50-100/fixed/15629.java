@java.lang.Override
public void onActivityCreated(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.support.v4.app.Fragment fragment = ir.asparsa.hobbytaste.core.util.NavigationUtil.getActiveFragment(getChildFragmentManager());
    com.google.android.gms.maps.SupportMapFragment mapFragment;
    if (!(fragment instanceof com.google.android.gms.maps.SupportMapFragment)) {
        mapFragment = com.google.android.gms.maps.SupportMapFragment.newInstance();
        getChildFragmentManager().beginTransaction().replace(R.id.content_nested, mapFragment).commit();
        mapFragment.getMapAsync(this);
    }
}