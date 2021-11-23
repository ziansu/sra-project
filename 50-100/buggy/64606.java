protected final void setTitle(java.lang.String title) {
    if ((midLLayout) != null) {
        midLLayout.removeAllViews();
        android.widget.TextView titleView = new android.widget.TextView(getActivity());
        titleView.setText(title);
        titleView.setTextSize(17);
        android.widget.LinearLayout.LayoutParams params = new android.widget.LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.MATCH_PARENT);
        params.weight = 1.0F;
        titleView.setLayoutParams(params);
        titleView.setBackgroundColor(Color.RED);
        titleView.setGravity(Gravity.CENTER);
        midLLayout.addView(titleView);
        this.title = title;
    }
}