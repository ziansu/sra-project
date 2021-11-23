public void setPhotoMode() {
    this.indicator.setSliderState((-1));
    this.worm.stretchTo((+1), (+1));
    this.bgGray.setBackgroundOpacity(1.0F);
    this.state = com.jfixby.telecam.ui.input.slider.Slider.PHOTO;
}