@java.lang.Override
public void onItemSelected(java.lang.String film_title) {
    if (myself.movieslist.MainActivity.mTwoPane) {
        myself.movieslist.MainActivity.firstStart = false;
        android.os.Bundle args = new android.os.Bundle();
        args.putString(DetailActivity.FILM_TITLE_KEY, film_title);
        myself.movieslist.DetailFragment fragment = new myself.movieslist.DetailFragment();
        fragment.setArguments(args);
        getSupportFragmentManager().beginTransaction().replace(R.id.film_detail_container, fragment).commit();
    }else {
        android.content.Intent intent = new android.content.Intent(this, myself.movieslist.DetailActivity.class).putExtra(DetailActivity.FILM_TITLE_KEY, film_title);
        startActivity(intent);
    }
}