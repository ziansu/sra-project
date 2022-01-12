public void scroll(java.lang.String d) {
    android.widget.LinearLayout history = ((android.widget.LinearLayout) (findViewById(R.id.history)));
    android.view.View v = history.findViewWithTag(d);
    scrollView.smoothScrollTo(0, java.lang.Math.round(v.getY()));
}