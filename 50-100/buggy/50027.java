@java.lang.Override
public void onResume() {
    super.onResume();
    if (((ntwInfo) != null) && (ntwInfo.isConnected()))
        updateMovieList();
    else {
        moviesGrid.setEmptyView(rootView.findViewById(R.id.empty_grid_view));
        android.widget.Toast.makeText(getActivity(), "Unable to Connect to Network!", Toast.LENGTH_LONG).show();
    }
}