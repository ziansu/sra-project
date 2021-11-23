public void onSwipeLeft() {
    if (isAppTrayVisible) {
        getSliderDrawerInView();
    }else {
        rightSlideDrawer.getRightSlideDrawerInView();
    }
}