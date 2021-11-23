private void setupViewPager() {
    tk.aibolik.app.insdu.fragments.map.MapHolderFragment.Adapter adapter = new tk.aibolik.app.insdu.fragments.map.MapHolderFragment.Adapter(getActivity().getSupportFragmentManager());
    com.google.android.gms.maps.SupportMapFragment mapFragment = com.google.android.gms.maps.SupportMapFragment.newInstance();
    tk.aibolik.app.insdu.fragments.map.places.PlacesFragment placesFragment = tk.aibolik.app.insdu.fragments.map.places.PlacesFragment.newInstance();
    mapFragment.getMapAsync(this);
    adapter.addFragment(placesFragment, "Places");
    adapter.addFragment(mapFragment, "Map");
    mPager.setAdapter(adapter);
}