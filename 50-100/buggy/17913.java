private void sliderOn() {
    double majorTick = java.lang.Math.floor(((totalSteps) / 10));
    slider.setDisable(false);
    slider.setMax(totalSteps);
    slider.setMajorTickUnit((majorTick <= 0 ? 1 : majorTick));
    slider.setMinorTickCount((((int) (java.lang.Math.floor(slider.getMajorTickUnit()))) / 5));
    slider.setValue(0);
}