private void updateShow() {
    SlideshowPresenter.currentSlide = slideStateMachine.getCurrentSlide();
    if ((SlideshowPresenter.currentSlide) != null) {
        SlideshowPresenter.PresentationImagePanel.setImage(SlideshowPresenter.currentSlide.getIcon().getImage());
    }
}