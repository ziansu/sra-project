public void run() {
    if ((currentPage) == (NUM_PAGES)) {
        currentPage = 0;
    }
    viewPagerCustomDuration.setCurrentItem(((currentPage)++), true);
}