@java.lang.Override
public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
    if ((getCallback()) != null) {
        getCallback().invalidateDrawable(this);
    }
}