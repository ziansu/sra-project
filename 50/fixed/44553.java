public void setSupportCarouselIndicatorTap(boolean supportCarouselIndicatorTap) {
    if (supportCarouselIndicatorTap != (this.supportCarouselIndicatorTap)) {
        this.supportCarouselIndicatorTap = supportCarouselIndicatorTap;
        if ((carouselIndicatorContainer) != null) {
            carouselIndicatorContainer.setHandleTapEvent(supportCarouselIndicatorTap);
        }
    }
}