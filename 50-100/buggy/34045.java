@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    android.view.MenuInflater inflater = getMenuInflater();
    inflater.inflate(R.menu.main_menu, menu);
    if ((com.example.autotests.popularmoviesapp.MainActivity.mSortBy) == (com.example.autotests.popularmoviesapp.MainActivity.TOP_RATED)) {
        menu.getItem(R.id.option_top_rated).setChecked(true);
    }
    return true;
}