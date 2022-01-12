public void setTickMarkRadius(float tickMarkRadius) {
    this.tickMarkRadius = tickMarkRadius;
    discreteSliderBackdrop.setTickMarkRadius(tickMarkRadius);
    discreteSliderBackdrop.invalidate();
}