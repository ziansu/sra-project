protected void setSliderValue(float value) {
    float relativeValue = (value - (mParameter.getMin())) / (mParameter.getMax());
    relativeValue = java.lang.Math.max(0.0F, java.lang.Math.min(1.0F, relativeValue));
    mSlider.setProgress(java.lang.Math.round((relativeValue * (de.yellow_ray.bluetoothtest.ParameterSlider.SLIDER_MAX))));
}