@java.lang.Override
public void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker) {
    if (marker.equals(markers.get(0))) {
        android.support.v4.app.Fragment newFragment = new com.example.vuun.description.activity.DetailFragment();
        android.os.Bundle bundle = new android.os.Bundle();
        java.lang.String place = "tl_01";
        bundle.putString("PLACE", place);
        newFragment.setArguments(bundle);
        android.support.v4.app.FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(android.R.id.content, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}