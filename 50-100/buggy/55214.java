@java.lang.Override
public void run() {
    final android.animation.ObjectAnimator animScrollToTop = android.animation.ObjectAnimator.ofInt(scrollView, "scrollY", scrollView.getBottom());
    animScrollToTop.setDuration(500);
    animScrollToTop.start();
    setTitleText(getString(R.string.no_source_found));
    websiteView.setText(R.string.no_source_instructions);
    no_results_or_error = true;
    try {
        mPagerAdapter.notifyDataSetChanged();
    } catch (java.lang.IllegalStateException ignored) {
    }
}