@java.lang.Override
public void onGenerated(android.support.v7.graphics.Palette palette) {
    android.support.v7.graphics.Palette.Swatch swatch = palette.getDarkVibrantSwatch();
    int backgroundColor = android.support.v4.content.ContextCompat.getColor(context, R.color.color_primary);
    int subtitleColor = android.graphics.Color.WHITE;
    if (swatch != null) {
        backgroundColor = swatch.getRgb();
        subtitleColor = swatch.getBodyTextColor();
    }
    collapsingToolbarLayout.setBackgroundColor(backgroundColor);
    collapsingToolbarLayout.setStatusBarScrimColor(org.fossasia.openevent.activities.SpeakerDetailsActivity.getDarkColor(backgroundColor));
    collapsingToolbarLayout.setContentScrimColor(backgroundColor);
    sessionsListAdapter.setColor(backgroundColor);
}