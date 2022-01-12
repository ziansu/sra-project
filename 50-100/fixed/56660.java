private void init() {
    this.setTypeface(android.graphics.Typeface.createFromAsset(context.getAssets(), "fonts/OpenSans-Bold.ttf"));
    this.setTextColor(android.support.v4.content.ContextCompat.getColor(context, R.color.colorPrimaryDark));
    this.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
    this.setAllCaps(true);
}