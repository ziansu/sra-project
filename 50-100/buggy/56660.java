private void init() {
    android.graphics.Typeface font = android.graphics.Typeface.createFromAsset(getContext().getAssets(), "fonts/Quicksand-Regular.ttf");
    this.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf"));
    this.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.colorPrimaryDark));
    this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    this.setAllCaps(true);
}