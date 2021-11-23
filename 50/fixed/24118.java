@android.annotation.TargetApi(value = Build.VERSION_CODES.JELLY_BEAN_MR1)
private boolean isRTL() {
    if ((Build.VERSION.SDK_INT) < (Build.VERSION_CODES.JELLY_BEAN_MR1)) {
        return false;
    }
    android.content.res.Configuration config = getResources().getConfiguration();
    return (config.getLayoutDirection()) != (android.view.View.LAYOUT_DIRECTION_RTL);
}