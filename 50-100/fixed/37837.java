public void setRightValue(final double VALUE) {
    if (VALUE <= 3500) {
        rightRotationAngle = (((1.8 * (java.lang.Math.PI)) / 4300) * VALUE) - ((java.lang.Math.PI) / 1.45);
        this.rightOldValue = VALUE;
        if (isValueCoupled()) {
            setLcdValue(VALUE);
        }
    }
    fireStateChanged();
    repaint(getInnerBounds());
}