@java.lang.Override
protected void setResource(@android.support.annotation.Nullable
fr.nihilus.music.glide.PaletteBitmap resource) {
    if (resource != null) {
        super.view.setImageBitmap(resource.getBitmap());
        android.support.v7.graphics.Palette.Swatch swatch = resource.getPalette().getDominantSwatch();
        int accentColor = resource.getPalette().getVibrantColor(mDefaultColors[1]);
        if (swatch != null) {
            holder.setColors(swatch.getRgb(), accentColor, swatch.getTitleTextColor(), swatch.getBodyTextColor());
        }
    }
}