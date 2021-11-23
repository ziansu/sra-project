@java.lang.Override
public void onClick(android.view.View view) {
    currentLocationButton.setEnabled(false);
    android.widget.Toast.makeText(getActivity(), getResources().getString(R.string.fetching_data), Toast.LENGTH_SHORT).show();
    new com.sanchez.geoopposite.MainFragment.LaunchMapTask().execute();
}