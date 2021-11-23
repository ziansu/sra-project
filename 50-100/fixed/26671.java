private void startAutomaticSlideShow() {
    if (!(slideStateMachine.getPausedState())) {
        SlideshowPresenter.currentSlide = slideStateMachine.getCurrentSlide();
        SlideshowPresenter.PresentationImagePanel.setImage(SlideshowPresenter.currentSlide.getIcon().getImage());
        if ((animator) == null) {
            animator = new Animation.Animator(SlideshowPresenter.PresentationImagePanel);
        }
        animator.start();
    }
}