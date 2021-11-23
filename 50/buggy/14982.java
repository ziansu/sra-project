private void updateShow() {
    SlideshowPresenter.currentSlide = slideStateMachine.getCurrentSlide();
    if (((SlideshowPresenter.currentSlide) != null) && (slideStateMachine.getPausedState())) {
        SlideshowPresenter.PresentationImagePanel.setImage(SlideshowPresenter.currentSlide.getIcon().getImage());
    }
}