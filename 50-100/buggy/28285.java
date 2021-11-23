private void turnPageLeft() {
    if ((getCurrentPage()) > 0) {
        int scrollY = getPrevPagePosition();
        current_y = scrollY;
        startAnimation(slideLeftAnimation);
        if ((getCurrentPage()) == 1) {
            scrollTo(0, scrollY);
        }else {
            scrollTo(0, (scrollY + ((PAGE_LEFT_COUNT) * (PAGE_PADDING))));
        }
        (PAGE_LEFT_COUNT)++;
        if ((PAGE_RIGHT_COUNT) > 3)
            (PAGE_RIGHT_COUNT)--;
        
    }
}