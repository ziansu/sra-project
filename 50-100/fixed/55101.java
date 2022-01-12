public void modify(int val) {
    try {
        int newValue = (this.getValue()) + val;
        newValue = (newValue > (this.minValue)) ? newValue : this.minValue;
        newValue = (newValue < (this.maxValue)) ? newValue : this.maxValue;
        setValue(newValue);
    } catch (com.htmlhigh5.vehicle.BadGPIOValueException e) {
        com.htmlhigh5.debug.Debug.printStackTrace(e);
    }
}