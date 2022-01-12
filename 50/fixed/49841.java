private void showCastFragment() {
    castFragment = tech.salroid.filmy.fragment.CastFragment.newInstance(null, movie_title);
    getSupportFragmentManager().beginTransaction().replace(R.id.cast_container, castFragment).commit();
}