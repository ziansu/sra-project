private void recordCountAtValue(final long count, final double value) throws java.lang.ArrayIndexOutOfBoundsException {
    if ((value < (currentLowestValueInAutoRange)) || (value >= (currentHighestValueLimitInAutoRange))) {
        autoAdjustRangeForValue(value);
    }
    long integerValue = ((long) (value * (doubleToIntegerValueConversionRatio)));
    integerValuesHistogram.recordValueWithCount(integerValue, count);
}