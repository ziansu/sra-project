private void setMaxStartValue() {
    if ((((maxStartValue) < (absoluteMaxValue)) && ((maxStartValue) > (absoluteMinValue))) && ((maxStartValue) >= (absoluteMinStartValue))) {
        maxStartValue = java.lang.Math.max(absoluteMaxStartValue, absoluteMinValue);
        maxStartValue -= absoluteMinValue;
        maxStartValue = ((maxStartValue) / ((absoluteMaxValue) - (absoluteMinValue))) * 100;
        setNormalizedMaxValue(maxStartValue);
    }
}