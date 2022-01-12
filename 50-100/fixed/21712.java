@android.support.annotation.Nullable
@java.lang.Override
public android.graphics.drawable.Drawable getDrawable(int resId, carbon.Theme theme) throws carbon.NotFoundException {
    if ((resId != 0) && (getResourceTypeName(resId).equals("raw"))) {
        return new carbon.drawable.VectorDrawable(this, resId);
    }else {
        return super.getDrawable(resId, theme);
    }
}