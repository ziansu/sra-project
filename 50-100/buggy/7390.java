public void setVideoMode() {
    this.indicator.setSliderState((+1));
    this.worm.stretchTo((-1), (-1));
    this.bgGray.setBackgroundOpacity(0.5F);
    this.state = com.jfixby.telecam.ui.input.slider.Slider.VIDEO;
    this.switchCameraButton.hide();
}