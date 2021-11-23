@java.lang.Override
protected android.widget.TextView updateDrawable(final android.graphics.drawable.Drawable newDrawable) {
    final android.widget.TextView view = super.updateDrawable(newDrawable);
    setBounds(cgeo.geocaching.utils.ImageUtils.scaleImageToLineHeight(newDrawable, view));
    return view;
}