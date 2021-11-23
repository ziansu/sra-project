@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable dr) {
    if (dr != null) {
        invalidate();
    }
}