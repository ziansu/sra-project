public void increaseValue() {
    java.lang.String oldValue = textBox.getValue();
    if ((isChangeable()) && (isValidForType(oldValue))) {
        try {
            java.lang.String newValue = getIncreasedValue(oldValue);
            if (isSmallerThanMax(newValue)) {
                textBox.setValue(newValue);
                value = newValue;
                valueUpdateTimer.schedule(updateDelay);
                valueUpdateTimer.setValue(newValue);
            }
        } catch (java.lang.Exception e) {
            valueUpdateTimer.cancel();
            com.google.gwt.core.client.GWT.log("Exception when increasing value", e);
        }
    }
}