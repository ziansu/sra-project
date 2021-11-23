@java.lang.Override
public void setImageResource(@android.support.annotation.DrawableRes
int resId) {
    super.setImageResource(resId);
    if ((mImageHelper) != null) {
        mImageHelper.applySkin();
    }
}