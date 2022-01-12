private void setMinStartValue() {
    if (((minStartValue) > (minValue)) && ((minStartValue) <= (maxValue))) {
        minStartValue = java.lang.Math.min(minStartValue, absoluteMaxValue);
        minStartValue -= absoluteMinValue;
        minStartValue = ((minStartValue) / ((absoluteMaxValue) - (absoluteMinValue))) * 100;
        setNormalizedMinValue(minStartValue);
    }
}