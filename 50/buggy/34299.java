private void setYAxis() {
    java.lang.String[] yAxis = getYAxisValueWithDeltaAsInteger(new float[]{ getMinValue() , getMaxValue() }, 6, false);
    setYAxisLabels(yAxis);
}