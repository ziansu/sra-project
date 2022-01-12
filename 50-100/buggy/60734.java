@java.lang.Override
public boolean onQueryTextSubmit(java.lang.String query) {
    android.util.Log.d("MovieListActivity", "Search Submitted");
    if ((query.length()) > 0) {
        android.support.v4.app.FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        android.support.v4.app.Fragment newFragment = new com.example.showtime.app.MovieListFragment();
        android.os.Bundle args = new android.os.Bundle();
        args.putString("query", query);
        newFragment.setArguments(args);
        transaction.replace(R.id.movie_list, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    return false;
}