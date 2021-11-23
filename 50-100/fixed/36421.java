@java.lang.Override
public void onClick(android.view.View view) {
    android.app.Fragment homeFragment = new ambiesoft.start.fragment.HomeFragment();
    android.os.Bundle bundle = new android.os.Bundle();
    bundle.putString("dateFromPreviousFragment", ambiesoft.start.fragment.GoogleMapFragment.selectedDate);
    homeFragment.setArguments(bundle);
    getFragmentManager().beginTransaction().replace(R.id.content_frame, homeFragment).commit();
}