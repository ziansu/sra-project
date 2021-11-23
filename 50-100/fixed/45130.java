@java.lang.Override
public void onPaletteFound(android.support.v7.graphics.Palette argChangedPalette) {
    int white = org.bottiger.podcast.utils.ColorUtils.getBackgroundColor(holder.getActivity());
    int black = org.bottiger.podcast.utils.ColorUtils.getTextColor(holder.getActivity());
    holder.mLayout.setCardBackgroundColor(white);
    holder.mMainTitle.setTextColor(black);
    holder.description.setTextColor(black);
    holder.currentTime.setTextColor(black);
    holder.mTimeDuration.setTextColor(black);
}