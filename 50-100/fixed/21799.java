private void applyPalette(android.support.v7.graphics.Palette iPalette, java.lang.String titleOfFilm) {
    if (iPalette != null) {
        int primaryDark = getResources().getColor(R.color.primary_dark);
        int primary = getResources().getColor(R.color.primary);
        mToolbar.setBackgroundColor(iPalette.getMutedColor(primary));
        com.raulh82vlc.topratemovies.widgets.CompatUtils.setToolBarColor(getWindow(), iPalette.getDarkMutedColor(primaryDark));
        startScrollFadeIn(titleOfFilm);
        android.support.v4.app.ActivityCompat.startPostponedEnterTransition(this);
    }
}