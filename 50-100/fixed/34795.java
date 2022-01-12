@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> Adapter, android.view.View view, int position, long arg3) {
    setExperimentFiles(position);
    android.support.v4.app.Fragment fragment = new se.umu.cs.pvt151.search.SearchResultExperimentFragment(rawFiles, profileFiles, regionFiles);
    getActivity().getSupportFragmentManager().beginTransaction().addToBackStack(null).replace(R.id.frame_container, fragment).commit();
}