@java.lang.Override
public void setButtonDrawable(android.graphics.drawable.Drawable d) {
    super.setButtonDrawable(null);
    getPaddingDrawable().setWrappedDrawable(d);
    super.setButtonDrawable(getPaddingDrawable());
}