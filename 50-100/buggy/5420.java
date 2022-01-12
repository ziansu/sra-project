public static java.lang.Double normalizeValue(java.lang.Double value, java.lang.Double maxValue, java.text.DecimalFormat df) {
    java.lang.Double temp = value / maxValue;
    if (temp >= 1.0) {
        temp = TensorFlowUtils.NORMALIZATION_MAX;
    }else
        if (value < (TensorFlowUtils.NORMALIZATION_MIN)) {
            temp = TensorFlowUtils.NORMALIZATION_MIN;
        }else {
            temp = java.lang.Double.valueOf(df.format(temp));
        }
    
    return temp;
}