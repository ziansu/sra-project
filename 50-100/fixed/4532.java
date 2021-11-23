public void setSkipValue(int value) {
    super.setSkipValue(value);
    ucar.visad.display.FlowDisplayable fd = getGridDisplay();
    if ((skipFactorWidget) != null) {
        skipFactorWidget.setValue(value);
    }
    if (fd != null) {
        fd.setUseSpeedForColor(useSpeedForColor);
        if (useSpeedForColor) {
            colorIndex = fd.getSpeedTypeIndex();
        }
    }
}