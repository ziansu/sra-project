@java.lang.SuppressWarnings(value = "ResourceType")
@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    int vibrantColor = palette.getVibrantColor(R.color.colorPrimary);
    int vibrantDarkColor = palette.getDarkVibrantColor(R.color.colorPrimary);
    collapsingToolbarLayout.setContentScrimColor(vibrantColor);
    collapsingToolbarLayout.setStatusBarScrimColor(vibrantDarkColor);
}