private void initIndeterminate() {
    android.content.Context context = getContext();
    indeterminate = new android.widget.ProgressBar(context, null, android.R.attr.progressBarStyle);
    int padding = applyDimension(TypedValue.COMPLEX_UNIT_DIP, 16);
    indeterminate.setPadding(0, padding, 0, padding);
    if ((Build.VERSION.SDK_INT) >= (Build.VERSION_CODES.LOLLIPOP)) {
        indeterminate.getIndeterminateDrawable().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);
    }
    indeterminate.setVisibility(View.GONE);
}