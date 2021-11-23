@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> Adapter, android.view.View view, int position, long arg3) {
    se.umu.cs.pvt151.model.DataStorage.setRawDataFiles(rawFiles);
    se.umu.cs.pvt151.model.DataStorage.setProfileDataFiles(profileFiles);
    se.umu.cs.pvt151.model.DataStorage.setRegionDataFiles(regionFiles);
    setExperimentFiles(position);
    android.support.v4.app.Fragment fragment = new se.umu.cs.pvt151.search.SearchResultExperimentFragment(rawFiles, profileFiles, regionFiles);
    getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).add(R.id.frame_container, fragment).commit();
}