private void handlePagerSlidedEvent(com.github.stakkato95.sprint3.event.PagerSlidedEvent event) {
    if ((mFilterMenuItem) != null) {
        mFilterMenuItem.setVisible(event.isTopPageVisible());
        mIsTopPageOpened = true;
    }
}