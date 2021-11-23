private void init() {
    android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
    this.setBackgroundResource(R.drawable.dotted_shape);
    this.setHintTextColor(Color.MAGENTA);
    this.setTextColor(Color.BLUE);
    this.setClickable(true);
    this.setFocusable(true);
    this.setTextSize(getResources().getDimension(R.dimen.movable_text_view_default_text_size));
    this.setLayoutParams(layoutParams);
}