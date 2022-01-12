@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    if (checkNetwork()) {
        new com.example.mlanka.popularmovies.MoviesFragment.FetchTask().execute(parent.getItemAtPosition(position).toString());
    }else {
        android.widget.Toast.makeText(getActivity(), "Network unavailable", Toast.LENGTH_SHORT).show();
    }
}