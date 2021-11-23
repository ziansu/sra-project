@java.lang.SuppressWarnings(value = "deprecation")
private void initHandleBackground() {
    android.content.res.Resources resources = getResources();
    if ((android.os.Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        handle.setImageDrawable(resources.getDrawable((isVertical() ? R.drawable.fastscroller_handle_vertical : R.drawable.fastscroller_handle_horizontal), getContext().getTheme()));
    }else {
        handle.setImageDrawable(resources.getDrawable((isVertical() ? R.drawable.fastscroller_handle_vertical : R.drawable.fastscroller_handle_horizontal)));
    }
}