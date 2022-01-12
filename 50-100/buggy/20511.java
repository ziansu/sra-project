private void showFragmentMap(java.util.ArrayList<java.lang.String[]> Lijst) {
    empty = Lijst;
    android.app.Fragment newFrag = new nmct.howest.be.desproject.ShowMapFragment().newInstance("a", "b");
    android.app.FragmentManager fMgr = getFragmentManager();
    android.app.FragmentTransaction fTr = fMgr.beginTransaction();
    fTr.replace(R.id.container, newFrag);
    fTr.addToBackStack("mainfrag");
    fTr.commit();
    com.google.android.gms.maps.MapFragment mapFragment = ((com.google.android.gms.maps.MapFragment) (newFrag));
    mapFragment.getMapAsync(this);
}