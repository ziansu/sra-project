public void moveView(int from, int to) {
    android.view.View view = getChildAt(from);
    super.removeViewAt(from);
    super.addView(view, to);
}