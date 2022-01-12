@java.lang.Override
public void onActivityCreated(android.os.Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);
    android.app.Activity activity = getActivity();
    try {
        callback = ((com.example.michael.topmovies.MainActivityFragment.GetMoviesList) (activity));
    } catch (java.lang.ClassCastException e) {
        android.util.Log.e(LOG_TAG, "Activity did not implement GetMoviesList interface");
    }
    movieEntries = callback.getMoviesList();
    adapter = new com.example.michael.topmovies.ImageAdapter(activity, R.layout.grid_item, movieEntries);
    android.widget.GridView gridView = ((android.widget.GridView) (activity.findViewById(R.id.grid_view)));
    gridView.setAdapter(adapter);
}