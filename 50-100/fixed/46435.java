public void setValue(int newValue) {
    int value = newValue;
    if (newValue < (minValue)) {
        value = minValue;
    }else
        if (newValue > (maxValue)) {
            value = maxValue;
        }
    
    valueTextView.setText(java.lang.String.valueOf(value));
}