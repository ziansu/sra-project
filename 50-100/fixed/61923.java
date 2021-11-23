protected void setupArguments(int itemId, android.widget.ImageView poster) {
    android.os.Bundle args = new android.os.Bundle();
    args.putInt(org.xbmc.kore.ui.AbstractDetailsFragment.ITEMID, itemId);
    if (poster != null) {
        android.graphics.Bitmap bitmap = null;
        android.graphics.drawable.Drawable drawable = poster.getDrawable();
        if (drawable instanceof android.graphics.drawable.BitmapDrawable) {
            bitmap = ((android.graphics.drawable.BitmapDrawable) (poster.getDrawable())).getBitmap();
        }
        args.putParcelable(org.xbmc.kore.ui.AbstractDetailsFragment.POSTERID, bitmap);
    }
    setArguments(args);
}