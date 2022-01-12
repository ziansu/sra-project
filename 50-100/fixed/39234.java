private void setOffset(float offset, int position) {
    this.offset = offset;
    offsetPixel = java.lang.Math.round(((stepDistance) * offset));
    if ((currentStepPosition) > position) {
        offsetPixel = (offsetPixel) - (stepDistance);
    }else {
        currentStepPosition = position;
    }
    invalidate();
}