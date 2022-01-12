@java.lang.Override
protected void onResumeFragments() {
    super.onResumeFragments();
    pageChangeListener.onPageSelected(viewPager.getCurrentItem());
}