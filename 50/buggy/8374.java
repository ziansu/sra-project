public void previousClick(android.view.View view) {
    (currentPosition)--;
    viewPager.setCurrentItem(currentPosition, true);
    updateProgress();
}