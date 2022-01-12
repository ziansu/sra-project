@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String sort_choice = ((java.lang.String) (parent.getItemAtPosition(position)));
    if (checkNetwork()) {
        new com.example.mlanka.popularmovies.MoviesFragment.FetchTask().execute(sort_choice);
    }else {
        android.widget.Toast.makeText(getActivity(), "Network unavailable", Toast.LENGTH_SHORT).show();
    }
}