private void changeValue(boolean add) {
    float oldValue = value;
    if (add) {
        value = java.lang.Math.min(maxValue, ((value) + (step)));
    }else {
        value = java.lang.Math.max(minValue, ((value) - (step)));
    }
    if ((onValueChangedListener) != null) {
        onValueChangedListener.onValueChanged(this, value, oldValue, minValue, maxValue, false);
    }
}