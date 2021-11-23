@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    switch (item.getItemId()) {
        case R.id.action_refresh :
            new com.namclu.android.popularreels.FetchMovieTask(mMovieAdapter).execute();
            return true;
    }
    return super.onOptionsItemSelected(item);
}