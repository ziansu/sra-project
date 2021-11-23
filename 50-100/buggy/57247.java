@java.lang.Override
public void onPaletteFound(android.support.v7.graphics.Palette argChangedPalette) {
    int white = mActivity.getResources().getColor(R.color.white_opaque);
    org.bottiger.podcast.utils.ColorExtractor colorExtractor = new org.bottiger.podcast.utils.ColorExtractor(argChangedPalette);
    viewHolder.mLayout.setCardBackgroundColor(colorExtractor.getPrimary());
    viewHolder.mMainTitle.setTextColor(colorExtractor.getTextColor());
    viewHolder.description.setTextColor(colorExtractor.getTextColor());
    viewHolder.currentTime.setTextColor(white);
    viewHolder.mTimeDuration.setTextColor(white);
}