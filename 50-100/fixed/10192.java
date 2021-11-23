@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    mCollapsingToolbar.setContentScrimColor(palette.getVibrantColor(R.attr.colorPrimary));
    mCollapsingToolbar.setStatusBarScrimColor(palette.getDarkVibrantColor(R.attr.colorPrimaryDark));
    com.centerstage.limelight.MovieFragment fragment = ((com.centerstage.limelight.MovieFragment) (getSupportFragmentManager().findFragmentById(R.id.movie_fragment)));
    if (fragment != null)
        fragment.onPaletteGenerated(palette);
    
}