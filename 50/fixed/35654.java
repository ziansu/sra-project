private void handlePagerSlidedEvent(com.github.stakkato95.sprint3.event.PagerSlidedEvent event) {
    mIsTopPageOpened = event.isTopPageVisible();
    if ((mFilterMenuItem) != null) {
        mFilterMenuItem.setVisible(mIsTopPageOpened);
    }
}