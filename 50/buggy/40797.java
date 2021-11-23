public void run() {
    if ((currentPage) == ((NUM_PAGES) - 1)) {
        currentPage = 0;
    }
    viewPagerCustomDuration.setCurrentItem(((currentPage)++), true);
}